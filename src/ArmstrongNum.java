import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number : ");
            int n=sc.nextInt();
            System.out.println(checkArmstrong(n));
        }
        //print All the armstrong numbers in a range 
        
        // for(int i=100;i<1000;i++){
        //     if(checkArmstrong(i)==true){
        //         System.out.println(i);
        //     }
        // }
    }

    //ArmStrong number is when the sum of cubes of individual digits of a number is the number itself 
    static boolean checkArmstrong(int n){
        int original=n;
        double sum=0;
        int count=Integer.toString(n).length();
        while(n>0){
            int remainder=n%10;
            double cube=Math.pow(remainder,count);
            sum=sum+cube;
            n=n/10;
        }
       return sum==original;
    }
}
