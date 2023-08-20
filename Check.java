import java.util.*;

public class Check {
    public static void main(String args[]){
        char ch;
        System.out.print("please Enter charecter:");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'|| ch=='u'){
            System.out.print("Vowel");
        
        }
        else{
            System.out.print("Consonent");
        }
        sc.close();
    }
}
