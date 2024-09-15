import java.util.Scanner;
public class Simpleinterest {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the principal :");
            double p=sc.nextDouble();
            System.out.println("Enter the Rate :");
            double r=sc.nextDouble();
            System.out.println("Enter the Time in years :");
            double t=sc.nextDouble();
            System.out.println("the simple interest is : "+findsimpleinterest(p,r,t));
        }   
    }    

    public static double findsimpleinterest(double p,double r,double t){
        return (p*r*t)/100;
    }
}
