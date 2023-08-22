/* prime number b/w two number */
//input first number 10
//input second number 20
//prime number ---> 11, 13, 

import java.util.Scanner;

public class PrimeNoAll {
    public static void main(String args[]){
        int n1,n2;
        int i,j;
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(i=n1;i<n2;i++){
            for(j=2;j<=i;j++){
                if(i%j==0)
                break;
            }
            if(i==j)
            System.out.print(j+" ");
        }
        sc.close();
    }
}
