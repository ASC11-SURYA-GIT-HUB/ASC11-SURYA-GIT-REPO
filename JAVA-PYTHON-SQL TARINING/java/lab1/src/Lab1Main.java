import java.util.Scanner;
import java.util.Arrays;
public class Lab1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Method Overloading
        System.out.println("=== Method Overloading ===");
        Calculator calc = new Calculator();
        System.out.println("add(10, 20): " + calc.add(10, 20));
        System.out.println("add(10, 20, 30): " + calc.add(10, 20, 30));
        System.out.println("add(10.5, 20.1): " + calc.add(10.5, 20.1));
        System.out.println("add(\"Hello\", 20): " + calc.add("Hello", 20));
        System.out.println("add((short)5, (short)6): " + calc.add((short)5, (short)6));

        // 2. Student Class
        System.out.println("\n=== Student Class ===");
        TestMain.main(null);

        // 3. Multiplication Table
        System.out.println("\n=== Multiplication Table ===");
        MultiplicationTable mt = new MultiplicationTable();
        System.out.print("Enter number for multiplication table: ");
        int num = sc.nextInt();
        System.out.println("\nUsing for loop:");
        mt.printTableForLoop(num);
        System.out.println("\nUsing while loop:");
        mt.printTableWhileLoop(num);
        System.out.println("\nUsing do-while loop:");
        mt.printTableDoWhileLoop(num);

        // 4. Word Count
        System.out.println("\n=== Word Count ===");
        sc.nextLine();  // consume leftover newline
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        WordCount wc = new WordCount();
        System.out.println("Number of words: " + wc.countWords(inputStr));

        // 5. String Methods
        System.out.println("\n=== String Methods ===");
        StringMethodsDemo smd = new StringMethodsDemo();
        smd.testMethods(inputStr);

        // 6. ArrayStore Class
        System.out.println("\n=== ArrayStore Class ===");
        ArrayStore arrayStore = new ArrayStore();
        arrayStore.accept(sc);
        arrayStore.displayWithWhile();
        arrayStore.displayWithFor();
        arrayStore.sort();

        System.out.print("Enter number to count occurrences: ");
        int valToCount = sc.nextInt();
        System.out.println("Occurrences of " + valToCount + ": " + arrayStore.countOccurrences(valToCount));

        System.out.print("Enter number to insert: ");
        int valToInsert = sc.nextInt();
        System.out.print("Enter position to insert (0 to 9): ");
        int pos = sc.nextInt();
        arrayStore.insertAt(valToInsert, pos);

        System.out.println("Array without duplicates: " + Arrays.toString(arrayStore.removeDuplicates()));

        sc.close();
    }
}
