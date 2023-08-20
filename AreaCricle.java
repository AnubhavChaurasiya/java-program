          /* Area of circle */
//area of circleis pi*r*r
//pi=22/7 or 3.14

import java.util.Scanner;

public class AreaCricle {
    public static void main(String args[]){
        final double PI=3.14;
        int r;
        double area;
        System.out.println("Enter the radius of circle:");
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        area=PI*r*r;
        System.out.println("Area of circle is " +area);
        sc.close();
    }
}
