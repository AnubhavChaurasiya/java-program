
import java.util.Arrays;

public class array3 {
    public static void main(String args[]){
        String  a[]={"Anubhav ", "Chaurasiya ","is ","the ","best "};
        System.out.println("toString() "+Arrays.toString(a));
        System.out.println("asList() "+Arrays.asList(a));
        int arr[][]={{10,20},{30,40}};
        System.out.println("deeptoString() "+Arrays.deepToString(arr));
    }
}
