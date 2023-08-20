/* check number is positive or negative */
//input n>0 positive
//input n<0 negative
// input n==0 neither positive nor negative

import java.util.Scanner;

public class CheckNo {
    public static void main(String args[]){
        int n;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         if(n>0){
            System.out.println("positive number:");
         }
         else if(n<0){
            System.out.println("negative number:");
         }
         else {
            System.out.println("nethir positive nor negative:");
         }
        sc.close();
    }
}
