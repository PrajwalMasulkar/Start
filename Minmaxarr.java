import java.util.*;
//Compairing in pairs for finding min and max3
public class Minmaxarr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array for finding min and max");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        System.out.println("Enter the elements in an array for finding min and max");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is: ");
        for (int i = 0; i < arr_size; i++) {
            System.out.print(arr[i] + " ");
        }
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
    }

    static class Pair {
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        int i;
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                minmax.max = arr[0];
                minmax.min = arr[1];
            } else {
                minmax.min = arr[0];
                minmax.max = arr[1];
            }
            i = 2;
        } else {
            minmax.min = arr[0];
            minmax.max = arr[0];
            i = 1;
        }

        while (i < n - 1) {

            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minmax.max) {
                    minmax.max = arr[i];
                }
                if (arr[i + 1] < minmax.min) {
                    minmax.min = arr[i + 1];
                }
            } else {
                if (arr[i + 1] > minmax.max) {
                    minmax.max = arr[i + 1];
                }
                if (arr[i] < minmax.min) {
                    minmax.min = arr[i];
                }
            }
            i += 2;
        }
        return minmax;
    }
}