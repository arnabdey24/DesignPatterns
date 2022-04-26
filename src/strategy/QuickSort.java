package strategy;

public class QuickSort implements SortingStrategy {

    @Override
    public <T extends Comparable<T>> void sort(T[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private <T extends Comparable<T>> boolean less_than(T a, T b) {
        return (a.compareTo(b) < 0);
    }

    private <T extends Comparable<T>> boolean less_than_equal(T a, T b) {
        return (a.compareTo(b) <= 0);
    }

    private <T extends Comparable<T>> boolean greater_than(T a, T b) {
        return (a.compareTo(b) > 0);
    }

    private void swap(Object[] a, int ii, int jj) {
        Object swap = a[ii];
        a[ii] = a[jj];
        a[jj] = swap;
    }

    private <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {
        if (min < max) {
            // create partitions
            int indexofpartition = partition(data, min, max);

            // sort the left partition (lower values)
            quickSort(data, min, indexofpartition - 1);

            // sort the right partition (higher values)
            quickSort(data, indexofpartition + 1, max);
        }
    }

    private <T extends Comparable<T>> int partition(T[] data, int min, int max) {
        T partitionElement;
        int left, right;
        int middle = min + ((max - min) / 2);

        // use the middle data value as the partition element
        partitionElement = data[middle];
        // move the middle element out of the way for now
        swap(data, middle, min);

        left = Math.max(min, 0);
        right = Math.min(max, data.length - 1);
        while (left < right) {
            // search for an element that is > the partition element
            while ((left < right) && (less_than_equal(data[left], partitionElement))) {
                left++;
            }
            // search for an element that is < the partition element
            while (greater_than(data[right], partitionElement)) {
                right--;
            }
            // swap the elements
            if (left < right) {
                swap(data, left, right);
            }
        }

        // move the partition element back into place
        // right will be the index of the partition element
        swap(data, min, right);

        return right;
    }
}
