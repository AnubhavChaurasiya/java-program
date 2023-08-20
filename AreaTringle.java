
   /* area of tringle */
   //input a,b,c;
   //find semiparemiter (a+b+c)/2
   //area of tringle
   import java.util.*;
   import java.lang.Math;
public class AreaTringle {
    public static void main(String args[]){
        int a,b,c;
        double sp;
        double area;
        System.out.println("Enter value for side tringle ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sp=(a+b+c)/2;
        area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("Area of tringle is "+ area);
        sc.close();
    }
}
