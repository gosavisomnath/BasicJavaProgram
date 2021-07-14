import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number a,b");
        a =sc.nextInt();
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping a:"+a);
        System.out.println("After Swapping b:"+b);


    }
}
