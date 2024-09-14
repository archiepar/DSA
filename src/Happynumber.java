import java.util.Scanner;

public class Happynumber{
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number to be checked : ");
            int n=sc.nextInt();
            System.out.println(isHappy(n));
        }
    }
    public static boolean isHappy(int n) {
        int m=n;
        int sum=0;
        int square;
        int countm=0;
        int[] arr=new int[200];
        while(m!=1){
             for(int i=0;i<countm;i++){
                    if(m==arr[i]){
                        return false;
                    }
                }
            arr[countm]=m;
            countm++;
            while(m>0){
            int digit=m%10;
            square=digit*digit;
            sum=sum+square;
            m=m/10;
            }
                m=sum;
                sum=0;
        }
        return true;
    }
}




   