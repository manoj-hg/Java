import java.util.Scanner;
public class NegPos {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    double n=sc.nextDouble();
    if(n<0.0){
        System.out.println("Number is negative");
    }else{
        System.out.println("Number is Positive");
    }

}
}

