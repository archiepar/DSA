import java.util.Scanner;

public class Occurrences {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){

            System.out.println("Enter the original number : ");
            Integer n=sc.nextInt();
            System.out.println("Enter the number to count the occurences of : ");
            int m=sc.nextInt();

            int size=n.toString().length();

            int count=0;

            for(int i=0;i<size;i++){
                int remainder=n%10;
                if(remainder==m){
                    count++;
                }
                n=n/10;
            }
            System.out.println("The number of occurrences for "+m+" are : "+count);

        }
    }    
}
