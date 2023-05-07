import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] items = { 2, 4, 1, 7, 3, 5, 0, 5, 3 };

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(items));

        var sorter = new CountingSort();
        sorter.sort(items, 7);

        System.out.println("\nAfter sorting");
        System.out.println(Arrays.toString(items));
    }
}