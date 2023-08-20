/* print ASCII value of character */
import java.util.*;
public class Ascii {
    public static void main(String args[]){
        char ch;
        System.out.println("Enter a character:");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int a=ch;
        System.out.print("ASCII value of "+ch +" is "+ a);
        sc.close();
    }    
}
