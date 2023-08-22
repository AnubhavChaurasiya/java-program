/* Enter month number & print number of days in a month */
//input month number 1 ----> january=31 days

import java.util.Scanner;

public class Month {
     public static void main(String args[]){
        int n;
        System.out.println("Enter any number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         switch(n){
                case 1: System.out.println("jan = 31 days");
                break;
                case 2: System.out.println("feb = 28 days");
                break;
                case 3: System.out.println("march = 31 days");
                break;
                case 4: System.out.println("April = 30 days");
                break;
                case 5: System.out.println("may = 31 days");
                break;
                case 6: System.out.println("june = 30 days");
                break;
                case 7: System.out.println("july = 31 days");
                break;
                case 8: System.out.println("Aug = 31 days");
                break;
                case 9: System.out.println("Sept = 30 days");
                break;
                case 10: System.out.println("Oct = 31 days");
                break;
                case 11: System.out.println("Non = 30 days");
                break;
                case 12: System.out.println("Dec = 31 days");
                break;
                default:System.out.println("Invalid number:");

         }
        sc.close();
     }
}
