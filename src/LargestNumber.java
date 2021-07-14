import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a,b,c");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = a > b ? a : b;
        int largest = c > temp ? c : temp;
        System.out.println("largest number" + largest);

    }
}