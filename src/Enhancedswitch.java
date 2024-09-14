import java.util.Scanner;
//code for enhanced switch case
public class Enhancedswitch {
    public static void main(String[] args) {
        
        //Enhanced Switch method
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number : ");
            int n=sc.nextInt();
            switch(n){
                case 1->System.out.println("Monday");
                case 2->System.out.println("Tuesday");
                case 3->System.out.println("Wednesday");
                case 4->System.out.println("Thursday");
                case 5->System.out.println("Friday");
                case 6->System.out.println("Saturday");
                case 7->System.out.println("Sunday");
                default->System.out.println("The given number does not represent a valid day of the week .");

            }

            
        }

    }

}
