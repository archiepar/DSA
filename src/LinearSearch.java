import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the size of the array : ");
            int size=sc.nextInt();
            System.out.println("Enter the arr elements : ");
            int[] arr=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the element to find in the array : ");
            int tofind=sc.nextInt();
            System.out.println("The required element is at index: " + linearsearch(arr,tofind));
        }
    }

    static int linearsearch(int[] arr,int n){
        if(arr.length==0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index]==n){
                return index;
            }
        }
        return -1;

    }
}
