public class SelectionSort {

    public void sort(int[] items) {
        for(int i = 0; i < items.length - 1; i++) {
            int lowestIndex = i;
            for(int j = i; j < items.length; j++)
                if(items[j] < items[lowestIndex])
                    lowestIndex = j;
            swap(items, i, lowestIndex);
        }
    }

    public void swap(int[] items, int index1, int index2) {
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }
}
