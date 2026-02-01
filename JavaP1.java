import java.util.Scanner;
public class JavaP1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int mynumber=(int)(Math.random()*100);
        int usernumber=0;
        System.out.println("Welcome to the game\n");
        System.out.println("I have assigned a random value guess it!! ");


        do{
            System.out.println("Choose a Number Between 1 to 100:");
            usernumber=sc.nextInt();

            if(usernumber == mynumber){
                System.out.println("You got the number right");
                break;
            }else if(usernumber ==100){
                System.out.println("Your Enetered number greater or equal to 100.");
                break;
            }else if(usernumber > mynumber){
                System.out.println("Number is too large.");
            } else {
                System.out.println("Number is too low.");
            }
        }while(usernumber>=0);
        System.out.println("The Number is:");
        System.out.println(mynumber);
    }
}