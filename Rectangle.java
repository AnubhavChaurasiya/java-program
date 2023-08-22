         /* Area of rectangle */
//input length
//input breath
//formula length* breath

import java.util.Scanner;

public class Rectangle {
    public static void main(String args[]){
        int l,b,area;
        System.out.println("Enter value for side");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        area=l*b;
        System.out.println("Area of rectangle " +area);
        sc.close();
    }
    
}
