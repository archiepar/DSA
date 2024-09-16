import java.util.Scanner;
public class SearchinRange {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number of elements : ");
            int n=sc.nextInt();
            System.out.println("Enter the array elements : ");
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the target element : ");
            int target=sc.nextInt();
            System.out.println("Enter the range in which we can search : ");
            System.out.print("Low :");
            int low=sc.nextInt();
            System.out.print("High : ");
            int high=sc.nextInt();
            System.out.println("The desired element is at : "+searchinRangefunc(arr,target,low,high));
        }
    }

    static int searchinRangefunc(int[] arr,int t,int low,int high){
        if(arr.length==0){
            return -1;
        }
        for(int i=low;i<=high;i++){
            if(arr[i]==t){
                return i;
            }
        }
        //-1 means doesnt exist
        return -1;
    }
}
