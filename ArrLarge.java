import java.util.Scanner;
import java.util.Arrays;
public class ArrLarge {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of arrays:");
        int n=sc.nextInt();
        int[] numbers=new int[n];

        System.out.println("Enter " +n+ " integers:");
        for(int i=0;i<n;i++){
            System.out.println("Element"+(i+1)+":");
            numbers[i]=sc.nextInt();

        }
        int max=numbers[0];
        for(int i=1;i<n;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The largest element:"+max);

    }
}
