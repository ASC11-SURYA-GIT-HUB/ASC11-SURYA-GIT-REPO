import java.util.*;

class ArrayStore {
    private int[] arr = new int[10];

    public void accept(Scanner sc) {
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void displayWithWhile() {
        System.out.print("Array elements (while loop): ");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    public void displayWithFor() {
        System.out.print("Array elements (for loop): ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public void sort() {
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public int countOccurrences(int num) {
        int count = 0;
        for (int val : arr) {
            if (val == num) count++;
        }
        return count;
    }

    public void insertAt(int num, int pos) {
        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid position for insertion!");
            return;
        }
        arr[pos] = num;
        System.out.println("Inserted " + num + " at position " + pos);
    }

    public int[] removeDuplicates() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int val : arr) {
            set.add(val);
        }
        int[] noDupArray = new int[set.size()];
        int i = 0;
        for (int val : set) {
            noDupArray[i++] = val;
        }
        return noDupArray;
    }
}
