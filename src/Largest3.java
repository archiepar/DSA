
import java.util.Scanner;
public class Largest3 {

    public static int maxim(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the numbers : ");
            int a,b,c;
            int max;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            max=maxim(c,maxim(a,b));
            System.out.println(max);
        }

    }
}
