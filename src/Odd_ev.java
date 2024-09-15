


import java.util.Scanner;
public class Odd_ev{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number : ");
            int n=sc.nextInt();
            if(Odd_even(n)){
                System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
    static boolean Odd_even(int n){
        return n%2==0;
    }
}

