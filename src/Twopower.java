import java.util.Scanner;

public class Twopower {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number : ");
            int n=sc.nextInt();
            System.out.println(isPowerOfTwo(n));
        }
    }
        static public boolean isPowerOfTwo(int n){
            double k=0;
            if(n==1){
                return true;
            }
            while(n>=1){
                double pow=Math.pow(2,k);
                if(n<pow){
                    return false;
                }
                if(n==pow){
                    return true;
                }
                k++;
            }
            return false;
        }
    
}
