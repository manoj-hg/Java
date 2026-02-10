import java.util.Scanner;
public class Reverse {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        String r="";
        for(int i=0;i<s.length();i++){
            r=s.charAt(i)+r;
        }
        System.out.println(r);
    }
}
