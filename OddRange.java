import java.util.*;
public class OddRange{
    public static void main(String args[]){
        int n;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i=i+2){
            System.out.println(i + " ");
        }  
        sc.close(); 
    }
}

