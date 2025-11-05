//WAP to take input from user and print that input.

import java.util.Scanner;
public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = sc.nextLine();
        System.out.println("You input is " + " ' "+ userInput +" ' ");
        sc.close();
    }
}