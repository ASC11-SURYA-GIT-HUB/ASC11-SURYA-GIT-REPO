public class Utility {
    public static String welcomeMessage(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }
    // Add to the same Utility class
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void printDigitsInWords(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Please enter a 3-digit number.");
            return;
        }
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String numStr = String.valueOf(number);
        for (char digit : numStr.toCharArray()) {
            System.out.print(words[digit - '0'] + " ");
        }
        System.out.println();
    }
}
