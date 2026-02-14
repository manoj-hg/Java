import java.util.Scanner;
public class large {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number:");
    int n1=sc.nextInt();
    System.out.println("Enter Second number:");
    int n2=sc.nextInt();
    System.out.println("Enter Third number:");
    int n3=sc.nextInt();
if(n1>n2 && n1>n3){
    System.out.println("N1 is larger");
}else if(n2>n3 && n2>n1){
    System.out.println("N2 is larger");
}else{
    System.out.println("N3 is larger");
}
}
}
