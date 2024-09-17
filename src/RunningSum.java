import java.util.Arrays;
import java.util.Scanner;
public class RunningSum {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The running sum array is : "+Arrays.toString(whatrunningSum(arr)));
        

    }
}
    static int[] whatrunningSum(int[] nums) {
        int[] arr2=new int[nums.length];
        if(nums.length==0){
            return arr2;
        }
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            arr2[i]=sum;
        }
        return arr2;
    }
    

}
