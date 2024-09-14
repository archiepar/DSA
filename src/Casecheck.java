import java.util.Scanner;

public class Casecheck{

    public static String casecheck(char a){
        if(a>='a' && a<='z'){
            return "lowercase";
        }
        else{
            return "uppercase";
        }
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the character : ");
        char a=sc.next().trim().charAt(0);
        System.out.println(casecheck(a));
        }
    }
}