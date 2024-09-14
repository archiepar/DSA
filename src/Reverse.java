import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number to reverse : ");
            Integer n=sc.nextInt();
            int size=n.toString().length();
            int reversed=0;
            for (int i = 0; i < size; i++) {
                int temp=n%10;
                reversed=reversed*10+temp;
                n=n/10;
            }
            System.out.println(reversed);
        }
    }
}
