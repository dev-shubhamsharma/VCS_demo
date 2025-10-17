import java.uti.Scanner;

class swap
{
    public static void main(String[] args)
    {
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();

        System.out.println("Before swapping x is "+x+" , Y is "+y);
        // swap using third variable

        
        // int temp = x;
        // x = y;
        // y = temp;

        // swap without using third variable

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After swapping x is "+x+" , Y is "+y);
        
    }
}
