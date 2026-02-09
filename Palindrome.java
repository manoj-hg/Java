
import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string name ");
        String s=sc.nextLine();
        boolean res = isPalindrome(s);
        if (res) {
            System.out.println('"' + s + '"' + " is a palindrome.");
        } else {
            System.out.println('"' + s + '"' + " is not a palindrome.");
        }
    }
}