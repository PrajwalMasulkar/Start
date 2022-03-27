import java.util.*;

class Array{
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
        System.out.println("Enter a Number to print its Index Value");
        int a = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(a==numbers[i])
            {
                System.out.println("Index value is "+i);
            }
            else
            {
                System.out.println("Number doesn't exist in array");
            }
        }




        //int[] marks = new int[4];
        /*marks[0]=20;
        marks[1]=23;
        marks[2]=78;
        marks[3]=50;
        for(int i =0;i<4;i++)
        {
            System.out.println(marks[i]);
        }*/
    }
}