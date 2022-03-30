import java.util.*;

public class Matmul
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

        System.out.println("Enter Number of rows in 2nd Matrix");
        int rows1 = sc.nextInt();
        System.out.println("Enter Number of columns in 2nd Matrix");
        int cols1 = sc.nextInt();
        System.out.println("Enter the Elements in 2nd Matrix");
        int[][] numbers1 = new int[rows1][cols1];
        for(int i=0;i<rows1;i++)
        {
            for(int j=0;j<cols1;j++)
            {
                numbers1[i][j]=sc.nextInt();
            }
        }
        System.out.println("2nd Matrix is");
        for(int i=0;i<rows1;i++)
        {
            for(int j=0;j<cols1;j++)
            {
                System.out.print(numbers1[i][j]+" ");
            }
            System.out.println();
        }
        //Multiplying Two Matrices
        int[][] product = new int[rows][cols1];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols1;j++)
            {
                for(int k=0;k<cols;k++)
                {
                    product[i][j] += numbers[i][k]*numbers1[k][j];
                }
            }
        }

        //Displaying the result
        System.out.println("Multiplication of two matrices is: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols1;j++)
            {
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }

    }
}