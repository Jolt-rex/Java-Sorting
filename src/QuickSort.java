public class QuickSort {
    public void sort(int[] items) {
        sort(items, 0, items.length - 1);
    }

    private void sort(int[] items, int start, int end) {
        if(start >= end)
            return;

        int pivot = end;
        int boundary = start - 1;
        for(int i = start; i <= end; i++)
            if(items[i] <= items[pivot] || i == pivot)
                swap(items, i, ++boundary);

        // sort left sub array
        sort(items, start, boundary - 1);

        // sort right sub array
        sort(items, boundary + 1, end);

    }

    public void swap(int[] items, int index1, int index2) {
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }
}
