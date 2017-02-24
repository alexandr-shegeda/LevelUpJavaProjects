package ua.dp.levelup.io.task2;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by java on 24.02.2017.
 */
public class FormulaChecker {

    public static void main(String[] args) {
        String[] formula = {
                "(a + b)",
                "a + b)",
                "(a + b",
                "a + b))",
                "a) + (b",
                "d - (s / ((a + b) * s) - ("
        };

        for(String f : formula) {
            String mistakes = findMistakes(f);
            if(mistakes != null) {
                System.out.println(f);
                System.out.println(mistakes);
            }
        }
    }

    private static String findMistakes(String formula) {
        char[] arr = formula.toCharArray();

        Deque<Integer> queue = new LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '(') {
                queue.offer(i);
            } else if(arr[i] == ')') {
                Integer lastIndex = queue.peekLast();
                if(!queue.isEmpty() && arr[lastIndex] == '(') {
                    queue.removeLast();
                } else {
                    queue.offer(i);
                }
            }
        }

        if (queue.isEmpty()) {
            return null;
        }

        StringBuilder builder = new StringBuilder(formula.replaceAll(".", " "));

        Iterator<Integer> iter = queue.iterator();
        while (iter.hasNext()) {
            int currentIndex = iter.next();
            builder.setCharAt(currentIndex, '^');
        }

        return builder.toString();
    }
}
