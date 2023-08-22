         /* leap year  */
  //century(100%==0 and 400%==0) 2000,2400,17000.300
  //  Yearly (100%!=0 and 4%=0)     

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        int y;
        System.out.println("Enter any year:");
        Scanner sc=new Scanner(System.in);
        y=sc.nextInt();
        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0){
            System.out.println("Leap year:");

        }
        else {
            System.out.println("Not Leap year:");
        }
        sc.close();
    }
    
}
