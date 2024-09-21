import java.util.Scanner;
public class ShortestPalindrome {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String s=sc.next();
            System.out.println(shortestPalindrome(s));
        }
    }

        public static String shortestPalindrome(String s) {
            int count = kmp(new StringBuilder(s).reverse().toString(), s);
            return new StringBuilder(s.substring(count)).reverse().toString() + s;
        }
    
        private static int kmp(String txt, String patt) {
            String newString = patt + '#' + txt;
            int[] pi = new int[newString.length()];
            int i = 1, k = 0;
            while (i < newString.length()) {
                if (newString.charAt(i) == newString.charAt(k)) {
                    k++;
                    pi[i] = k;
                    i++;
                } else {
                    if (k > 0) {
                        k = pi[k - 1];
                    } else {
                        pi[i] = 0;
                        i++;
                    }
                }
            }
            return pi[newString.length() - 1];
        }
}
