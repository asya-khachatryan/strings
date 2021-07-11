public class SortingUtil {

    private SortingUtil() {
    }

    public static void insertionSort(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            char initial = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > initial) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = initial;
        }
    }

    public static void quickSort(char[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(char[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                swap(array, counter, i);
                counter++;
            }
        }
        swap(array, pivot, counter);

        return counter;
    }

    private static void swap(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
