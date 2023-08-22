/* Swap two number without third variable */

import java.util.Scanner;

public class SwapWhitout {
    public static void main(String args[]){
        int a,b;
        System.out.print("Enter any two number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Swaping "+ a + " "+b);
        a=a+b;
        b=a-b;
        a=a-b;
         System.out.println("After Swaping "+ a + " "+b);
         sc.close();
    }
}
