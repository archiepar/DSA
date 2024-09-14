import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number :");
            int n=sc.nextInt();
            System.out.println(isPrime(n));
        }
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
