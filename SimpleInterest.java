import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        float p = sc.nextFloat();
        System.out.println("Enter the time period:");
        float t = sc.nextFloat();
        System.out.println("Enter the rate of interst:");
        float r = sc.nextFloat();
        float SI = (p * r * t) / 100;
        System.out.println("Simple Interest is: " + SI);
    }
}