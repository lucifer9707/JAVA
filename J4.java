//WAP to add Two Floating-Point numbers.

import java.util.Scanner;
public class J4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first floating-point number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second floating-point number:");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is = " + sum);
        sc.close();


    }
}
