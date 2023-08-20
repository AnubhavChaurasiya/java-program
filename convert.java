import java.util.Scanner;

public class convert {
    public static void main(String args[]){
        char ch,ch1;
        System.out.println("Enter any chareater");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            ch1=Character.toLowerCase(ch);
            System.out.println("Lowercase " + ch1);
        }
        else{
            ch1=Character.toUpperCase(ch);
            System.out.println("Uppercase " + ch1);
        }
        sc.close();
    }
    
}
