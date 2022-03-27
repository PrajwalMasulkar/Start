import java.util.*;

class asc{
    public static void main(String args[])
    {
        int marks[]={23,40,94,30};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        System.out.println("Enter Numbers to store in an array");
        int numbers[]= new int[size];
        for(int i=0;i<size;i++)
        {
            numbers[i]= sc.nextInt();
        }
        System.out.print("Entered Array is: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+numbers[i]);
        }
        System.out.println();
        //System.out.println("Enter a Number to print its Index Value");
        //int a = sc.nextInt();
        boolean f=true;
        for(int i=0;i<numbers.length-1;i++)
        {
            if(numbers[i]>numbers[i+1])
            {

                f = false;
                break;
            }

        }
        if(f)
        {
            System.out.println("array is sorted in ascending order");
        }
        else
        {
            System.out.println("array is not sorted in ascending order");
        }

    }
}