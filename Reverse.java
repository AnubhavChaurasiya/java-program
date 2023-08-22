/* Rverse Number program */
//input 123 --->  321

import java.util.Scanner;

public class Reverse {
     public static void main(String args[]){
        int n,r;
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
          r=n%10;
          System.out.print(r);
          n=n/10;  
        }
        sc.close();
    }
}
