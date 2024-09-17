import java.util.Arrays;
import java.util.Scanner;
public class ConcatenationofArray {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the size of the array : ");
            int size=sc.nextInt();
            System.out.println("Enter the elements of the array : ");
            int[] arr=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(Arrays.toString(getConcatenation(arr)));

    }
}

        static int[] getConcatenation(int[] nums) {
            int[] nums2=new int[2*nums.length];
            for(int i=0;i<nums.length;i++){
                nums2[i]=nums[i];
                nums2[i+nums.length]=nums[i];
            }
            return nums2;
        }
    
}
