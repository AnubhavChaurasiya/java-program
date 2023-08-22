/* Prime Number Program */
//input number 7 ----> prime number
//input number 6 ----> Not prime number

import java.util.Scanner;

public class PrimeNo {
    public static void main(String args[]){
        int n;
        int count=0;
        System.out.print("Enter any number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2)
          System.out.println("Prime number:");
          else
            System.out.println(" Not Prime number:");

        sc.close();
    }
}
