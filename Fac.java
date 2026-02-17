import java.util.Scanner;
public class Fac {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int fac=1;
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            fac *= i;

        }
        System.out.println("Factorial of number " +n+ " is:" +fac);
    }
}
