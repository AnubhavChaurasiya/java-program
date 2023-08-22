import java.util.Scanner;

public class Greatest {
    public static void main(String args[]){
        int a,b,c;
        System.out.println("Enter three number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.print(a);
            }
            else{
                System.out.print(b);
            }
        }
        else{
             if(b>c){
                System.out.print(b);
            }
            else{
                System.out.print(b);
            }

        }
        sc.close();
    }
    
}
