import java.util.Scanner;
public class Swap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        int temp;
        System.out.println("Swapping Two Numbers");
        System.out.println("Enter number a:");
        a=sc.nextInt();
        System.out.println("Enter number b:");
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);


    }
}
