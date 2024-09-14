import java.util.Scanner;

public class Poweroffour {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number : ");
            int n=sc.nextInt();
            System.out.println(isPowerOfFour(n));
        }
    }
   
    static public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        double res;
        if(n>0){
            for(double i=1;i<n;i++){
                res=Math.pow(4,i);
                if(res>n){
                    return false;
                }
                if(n==res){
                    return true;
                }
            }
        }
        return false;
    
}
}
