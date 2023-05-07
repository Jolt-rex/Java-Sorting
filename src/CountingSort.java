import java.util.Arrays;

public class CountingSort {
    public void sort(int[] items, int range) {
        int[] counts = new int[range + 1];
        for(int i = 0; i < items.length; i++)
            counts[items[i]]++;

        for(int i = 0, j = 0; i < counts.length; i++)
            for(int k = 0; k < counts[i]; k++)
                items[j++] = i;
    }
}
