/* Find Square root of a number */
//input number 25  ---->  5;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String args[]){
        int n;
        System.out.print("Enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double m=Math.sqrt(n);
        System.out.println("Square root of "+ n + "is" +m);

        sc.close();
    }
    
}
