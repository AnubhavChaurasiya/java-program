import java.util.Scanner;

public class Average {
    public static void main(String args[]){
        int a,b,c,d,e;
        System.out.print("Enter 5 number:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        int sum=a+b+c+d+e;
        System.out.println("total marks "+ sum);
        double avg=sum/5.0;
        System.out.print("Avarage marks "+ avg);
        sc.close();
    }
    
}
