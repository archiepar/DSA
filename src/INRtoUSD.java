import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the amount in INR : ");
            double inr=sc.nextDouble();
            System.out.println("The amount in USD is : "+toUSD(inr));
        }
    }
    static double toUSD(double inr){
        return inr*82.3;
}
}
