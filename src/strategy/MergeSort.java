package strategy;

public class MergeSort implements SortingStrategy {

    @Override
    public <T extends Comparable<T>> void sort(T[] data) {
        mergeSort(data, 0, data.length - 1);
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

    private <T extends Comparable<T>> void mergeSort(T[] data, int min, int max) {
        if (min < max) {
            int mid = min + ((max - min) / 2);
            mergeSort(data, min, mid);
            mergeSort(data, mid + 1, max);
            merge(data, min, mid, max);
        }
    }

    @SuppressWarnings({"unchecked"})
    private <T extends Comparable<T>> void merge(T[] data, int min, int mid, int max) {
        T[] temp = (T[]) (new Comparable[data.length]);  // temp array

        // The two subarrays have already been sorted
        int first1 = min, last1 = mid;   // endpoints of the first subarray
        int first2 = mid + 1, last2 = max;  // endpoints of the second subarray
        int index = first1;   // next index open in temp array

        // Copy the smaller item from each subarray until one of the subarrays is empty

        // While both subarrays have items left
        while ((first1 <= last1) && (first2 <= last2)) {
            if (less_than(data[first1], data[first2])) {
                // Move first1 to the temp array
                temp[index] = data[first1];
                first1++;
            } else {
                // Move first2 to the temp array
                temp[index] = data[first2];
                first2++;
            }
            index++;  // Move the index of the next available cell in the temp array
        }

        // Only one of the while loops below will execute

        // Copy the remaining elements from the first subarray, if any
        while (first1 <= last1) {
            temp[index] = data[first1];
            first1++;
            index++;
        }

        // Copy the remaining elements from the second subarray, if any
        while (first2 <= last2) {
            temp[index] = data[first2];
            first2++;
            index++;
        }

        // Copy merged data into original array
        for (index = min; index <= max; index++) {
            data[index] = temp[index];
        }
    }
}
