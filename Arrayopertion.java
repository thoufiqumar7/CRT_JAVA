import java.util.Scanner;

class ArrayOperations {
    static int arr[] = {34, 7, 23, 32, 5, 6, 5};
    public static int linearSearch(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("value Found at index: " + i);
                return i;
            }
        }
        System.out.println("value Not Found");
        return -1;
    }

    public static void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        displayArray();
    }

    public static int binarySearch(int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("value Found at index: " + mid);
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("value Not Found");
        return -1;
    }

    public static void displayArray() {
        System.out.print("Array contents: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;
        while (true) {
            System.out.println("\nMenu: 1-LinearSearch  2-Sort  3-BinarySearch  4-Display  5-Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to Linear search: ");
                    value = sc.nextInt();
                    linearSearch(value);
                    break;
                case 2:
                    bubbleSort();
                    break;
                case 3:
                    System.out.print("Enter value to Binary search: ");
                    value = sc.nextInt();
                    binarySearch(value);
                    break;
                case 4:
                    displayArray();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
