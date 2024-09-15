import java.util.Scanner;
public class Largest2 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the numbers :");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("The max of the 2 is : "+findMax(a, b));
        }
    }

    static int findMax(int a,int b){
        if(a>b){
            return a;
        }
        else if(b>a){
            return b;
        }
        else{
            return 0;
        }
    }
}
