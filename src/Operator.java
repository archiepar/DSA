import java.util.Scanner;
public class Operator {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the numbers :");
                double a=sc.nextDouble();
                double b=sc.nextDouble();
            System.out.println("Enter the operator : ");
                char c=sc.next().trim().charAt(0);
                System.out.println(calcOperator(a, b, c));
        }
    }

    static double calcOperator(double a,double b,char c){
        double result=0;
        switch(c){
            
            case '+'->result=a+b;
            case '/'->result=a/b;
            case '-'->result=a-b;
            case '*'->result=a*b;
    }
    return result;
}
}
