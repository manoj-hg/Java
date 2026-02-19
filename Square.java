import java.util.Scanner;
public class Square {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the the number to find the square:");
    int s=sc.nextInt();
    int square=s*s;
    System.out.println("Square of the number "+s+ " is:"+square);
}}
