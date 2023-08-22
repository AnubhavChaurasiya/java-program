/* write a program to check divisibility of 5 */
//input 10 -----> divisibolity by 5
//input 12 -----> not divisibility by 5

import java.util.Scanner;

public class Divisibility {
    public static void main(String args[]){
        int n;
        System.out.println("Enter any number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%5==0){
            System.out.println("divisibolity by 5");
        }
        else {
             System.out.println(" not divisibolity by 5");
        }
        sc.close();
    }
    
}
