import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Divident and Divisor:");
        int divident=sc.nextInt();
        int divisor=sc.nextInt();
        int quotient=divident/divisor;
        int remainder=divident%divisor;
        System.out.println("Quotient is:"+quotient);
        System.out.println("Remainder is:"+remainder);
    }
}
