import java.util.Scanner;
public class SearchString{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the string : ");
            String a=sc.next();
            System.out.println("Enter the character to search : ");
            char b=sc.next().trim().charAt(0);
            System.out.println("The desired character is at the index : "+charSearch(a, b));
            //MAIN
        }
    }
    static int charSearch(String a,char b){
        if(a.length()==0){
            return -1;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b){
                return i;
            }
        }
        return -1;
    }
}