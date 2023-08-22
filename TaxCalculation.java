import java.util.Scanner;

public class TaxCalculation {
    public static void main(String args[]){
        int sal;
        double tax=0;
        System.out.println("Enter Salary:");
        Scanner sc=new Scanner(System.in);
        sal=sc.nextInt();
        if(sal<10000){
            System.out.print(sal + tax);
        }
        else if(sal>=10000 && sal<100000){
              tax=sal*0.10;
              System.out.print(sal + tax);
        }
        else if(sal>=100000 && sal<1000000){
            tax=sal*0.20;
              System.out.print(sal + tax);

        }
        else{
            tax=sal*0.33;
              System.out.print(sal + tax);

        }
        sc.close();
    }
    
}
