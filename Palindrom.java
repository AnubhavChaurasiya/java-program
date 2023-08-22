/* Palindrom Number Program */
// input 121 ---> reverse the input is the same number

import java.util.Scanner;

public class Palindrom {
    public static void main(String args[]){
        int n,r,s=0,c;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         c = n;
        while(n>0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(c==s)
            System.out.println("palindrom Number");
        else
            System.out.println(" Not palindrom Number");
        sc.close();
    }
}
