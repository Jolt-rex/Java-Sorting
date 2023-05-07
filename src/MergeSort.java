public class MergeSort {
    public void sort(int[] items) {
        if(items.length == 1)
            return;

        int middle = items.length / 2;

        int[] left = new int[middle];
        for(int i = 0; i < middle; i++)
            left[i] = items[i];

        int[] right = new int[items.length - middle];
        for(int i = middle; i < items.length; i++)
            right[i - middle] = items[i];

        sort(left);
        sort(right);

        merge(left, right, items);
    }

    private void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length)
            if(left[i] <= right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];

        while(i < left.length)
            result[k++] = left[i++];

        while(j < right.length)
            result[k++] = right[j++];
    }
}
