import java.util.Scanner;
public class MaxMin3 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the 3 numbers : ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println("The max of the 3 is : "+findMax(a, b, c));
            System.out.println("The min of the 3 is : "+findMin(a, b, c));
        }
    }

    static int findMax(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else if(c>a && c>b){
            return c;
        }
        else return Math.max(a, b);
    }

    static int findMin(int a,int b,int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else if(c<a && c<b){
            return c;
        }
        else return Math.min(a, b);
    }
}
