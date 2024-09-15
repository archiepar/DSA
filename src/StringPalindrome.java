import java.util.Scanner;
class StringPalindrome{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String n=sc.next();
            String nrev=new StringBuilder(n).reverse().toString();
            System.out.println(n.equals(nrev));
        }
    }
}