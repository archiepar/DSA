
import java.util.Scanner;
public class Searchin2DArr {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int[][] arr=new int[3][3];
            System.out.println("Enter the elements of the array : ");
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the target element : ");
            int target=sc.nextInt();
            searchin2D(arr, target);
        }
    }

    static void searchin2D(int[][] arr,int target){
        if(arr.length==0){
            System.out.println("No elements in the array .");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println("The element is found at index : "+i+" , "+j);
                }
            }
   
        }
        
    }
}
