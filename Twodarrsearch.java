import java.util.*;

public class Twodarrsearch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter Number of columns");
        int cols = sc.nextInt();
        System.out.println("Enter the Elements");
        int[][] numbers = new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to search");
        int a = sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(numbers[i][j]==a)
                {
                    System.out.println("Given number is at index "+i+j);
                }
            }

        }

    }
}