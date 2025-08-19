public class quicksort {

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = arr[high];
            int i = low;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }
            }
            arr[high] = arr[i];
            arr[i] = pivot;
            quickSort(arr, low, i - 1);
            quickSort(arr, i + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 3, 6};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
