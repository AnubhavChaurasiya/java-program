import java.util.*;

public class CharPrint {
    public static void main(String args[]){
        char ch;
        System.out.print("please Enter charecter:");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.print(ch);
        sc.close();
    }
    
}
