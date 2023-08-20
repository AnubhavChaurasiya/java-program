
import java.util.Scanner;
public class array2 {
    public static void main(String args[]){
        int size,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array");
        size=sc.nextInt();
        int a[]=new int [size];
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("printed Array Element:");
        for(i=0;i<size;i++){
            System.out.print(a[i]+ " ");
        }
        sc.close();
        
    }
    
}
