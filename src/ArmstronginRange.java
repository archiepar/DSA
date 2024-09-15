import java.util.Scanner;
public class ArmstronginRange {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the range of numbers : ");
            int m=sc.nextInt();
            int n=sc.nextInt();
            armstrongSeries(m, n);
        }
    }

    static boolean isArmstrong(int n){
        int p=n;
        double res=0;
        int count=Integer.toString(n).length();
        while(p>0){
            int temp=p%10;
            double cube=Math.pow(temp,count);
            res=res+cube;
            p/=10;    
        }
        return res==n;
    }

    static void armstrongSeries(int a,int b){
        for(int i=a+1;i<b;i++){
            if(isArmstrong(i)==true){
                System.out.println(i);
            }
        }
    }
}

