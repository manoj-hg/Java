import java.util.Scanner;
public class Vowel {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the letter:");
    char v = sc.next().charAt(0);
    if(v=='a'||v=='e'||v=='i'|| v == 'o' ||v=='u'){
        System.out.println("It is a vowel");
    }else{
        System.out.println("It is a constant");
    }
}
}
