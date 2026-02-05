import java.util.Scanner;
 class Binary{
    static void decToBinary(int n){
        int[] binaryNum=new int[1000];
        int i=0;
        while(n>0){
            binaryNum[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
            System.out.println(binaryNum[j]);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=17;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        System.out.println("Binary-");
        decToBinary(n);

    }
}
