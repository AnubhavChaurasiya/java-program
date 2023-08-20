import java.util.Scanner;

public class Calculatar {
    public static void main(String args[]){
        int x,y,ch,cal;
        System.out.println("Enter two number:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Select Operation:");
        ch=sc.nextInt();
        if(ch==1){
            cal=x+y;
            System.out.print("Addition "+cal);
        }
        else if(ch==2){
            
            cal=x-y;
            System.out.print("Subtraction "+cal);
        }
        else if(ch==3){
            
            cal=x*y;
            System.out.print("Multiplication "+cal);
        }
        else if(ch==4){
            
            cal=x/y;
            System.out.print("Divition "+cal);
        }
        else{
            
            cal=x%y;
            System.out.print("Remender "+cal);
        }
        sc.close();
    }    
}
