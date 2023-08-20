       /* Area of square */
       //area=side*side
import java.util.*;

public class AreaSquare {
    public static void main(String args[]){ 
    int side;
    int area;
    System.out.print("Enter side of square");
    Scanner sc=new Scanner(System.in);
    side=sc.nextInt();
    area=side*side;
    System.out.println("Area of square is "+ area);
    sc.close();
}
   
}
