import java.util.Scanner;

public class Power {
    public static void main(String args[]){
        int n,p;
        int result=1;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter  the power:");
        p=sc.nextInt();
        for(int i=1;i<=p;i++){
            result=n*result;

        }
        System.out.println(result);
        sc.close();
    }
    
}
