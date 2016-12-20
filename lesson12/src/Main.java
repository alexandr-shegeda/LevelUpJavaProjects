public class Main {

    public static void main(String[] args) {
        System.out.println(convertToString(16178));
    }

    public static String convertToString(int n) {
        String res = null;

        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] hundreds = {"", "one hundred", ""};
        String[] thousands = {"", "one thousand"};



        String un = n%100 < 20 ? units[n%100] : tens[n%100/10] + " " + units[n%10];
        String th = n/1000%100 < 20 ? units[n%100] + " thousand(s)" : hundreds[n/1000/100%10] + " " + tens[n/1000%100/10] + " " + units[n/1000%10];
        return th + " " + hundreds[n/100%10] + " " +un;
    }
}
