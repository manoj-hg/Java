import java.util.Scanner;
public class Multiplication {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number you want the tables of:");
    int n=sc.nextInt();
    for(int i=1;i<=10;i++) {
        System.out.printf("%d*%d=%d\n",n,i, n*i );
    }
}}
