import java.util.Scanner;
public class Add {
    public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
        System.out.printf("Addition");
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        int sum =a+b;
        System.out.printf("The sum is:"+sum);
    }
}
