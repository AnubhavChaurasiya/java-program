import java.util.Scanner;

public class EvenRange {
    public static void main(String args[]){
        int n;
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=n;i=i+2){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
