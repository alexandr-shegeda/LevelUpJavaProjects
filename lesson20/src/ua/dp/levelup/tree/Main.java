package ua.dp.levelup.tree;

import java.util.Comparator;

/**
 * Created by java on 27.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        Tree<Integer> tree = new BinaryTree<>(Integer::compare);

        tree.add(52);

        tree.add(67); //right
        tree.add(64); //left
        tree.add(58); //left

        tree.add(29); //left
        tree.add(1);  //left
        tree.add(1);  //none

        tree.add(14); //left
        tree.add(37); //right

        tree.print();
    }
}
