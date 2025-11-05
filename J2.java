//WAP to print numbers from 1 to 10 without using loop.

public class J2 {
    public static void main(String[] args){
        printNum(1);
    }

    public static void printNum(int num) {
        if (num <= 10) {
            System.out.println(num);
            printNum(num + 1);
        }
    }
}
