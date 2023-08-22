/*print sum of odd or even in given range */
//even 10(0+2+4+6+8+10=30)
//odd 10(1+3+5+7+9+11=36)
import java.util.*;
public class Oddeven {
    public static void main(String args[]){
    int n,i,sum=0;
    System.out.print("Enter Range :");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    if(n%2==0){
        for(i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("Sum of even number is " + sum );
    }
    else{
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("Sum of odd number is " + sum);
    }
       sc.close(); 
  }
}
