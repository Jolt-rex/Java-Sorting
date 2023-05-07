public class BubbleSort {
    public void sort(int[] items) {
        boolean isSorted;
        for(int j = 0; j < items.length; j++) {
            isSorted = true;
            for (int i = 1; i < items.length - j; i++)
                if (items[i] < items[i - 1]) {
                    swap(items, i, i - 1);
                    isSorted = false;
                }
            if(isSorted)
                return;
        }
    }

    private void swap(int[] items, int index1, int index2) {
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }
}
