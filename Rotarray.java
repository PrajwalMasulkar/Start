import java.util.*;

public class Rotarray {
    public static void main(String args[]) {
        System.out.println("Enter no. of elements in a array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements in an array");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
      int i=0,j=arr.length-1;
        while(i!=j)
        {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
        for ( i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}