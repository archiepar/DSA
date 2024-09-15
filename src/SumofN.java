import java.util.Scanner;
public class SumofN {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number : ");
            int n=sc.nextInt();
            System.out.println("The sum of "+n+" natural numbers = "+sumofN(n));
        }
    }

    static int sumofN(int n){
        int result=((n*(n+1))/2);
        return result;
    }
}
