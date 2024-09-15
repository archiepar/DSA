import java.util.Scanner;
public class NumPalindrome {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt();
            System.out.println(isnumPalindrome(n));
        }
    }

    static int reverseNum(int n){
        int original=n;
        int rem;
        int numrev=0;
        while(original>0){
            rem=original%10;
            numrev=numrev*10+(rem);
            original/=10;
        }
        return numrev;
    }

    static boolean isnumPalindrome(int n){
        int reversed=reverseNum(n);
        return reversed==n;
    }
}
