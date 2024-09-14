import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the number of items in the series : ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" ");
        for(int i=2;i<=n;i++){
            int temp=b;
            b=b+a;
            a=temp;
            System.out.print(a+" ");
        }
    }
       
    }
}