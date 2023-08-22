import java.util.Scanner;

public class Max {
    public static void main(String args[]){
        int a,b;
        System.out.println("Enter two number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        sc.close();
    }
    
}
