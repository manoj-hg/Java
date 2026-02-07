
import java.util.Scanner;
public class ArrSum{
    int arr[];
    int sum(){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return sum;
}
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    ArrSum obj = new ArrSum();
    System.out.println("Enter the number of elements:");
    int n = sc.nextInt();
    obj.arr = new int[n];
    System.out.println("Enter the elements:");
    for (int i = 0; i < n; i++) {
        obj.arr[i] = sc.nextInt();
    }
    System.out.println("Sum of the given array:" + obj.sum());
}
}
