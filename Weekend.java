/* enter code of day and print name of day */
//input (1 to 7)

import java.util.Scanner;

public class Weekend {
    public static void main(String args[]){
        int n;
        System.out.println("Enter code of day :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         switch(n){
            case 1:  System.out.println("Sunday");
            break;
            case 2:  System.out.println("monday");
            break;
            case 3:  System.out.println("tuesday");
            break;
            case 4:  System.out.println("wednesday");
            break;
            case 5:  System.out.println("thrusday");
            break;
            case 6:  System.out.println("friday");
            break;
            case 7:  System.out.println("staurday");
            break;
            default:  System.out.println("Invalid number");
            
         }
        sc.close();
    }
}
