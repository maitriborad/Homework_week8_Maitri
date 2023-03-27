package homework;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class P09Fibonacci {
    public static void main(String[] args) {
        fibonacci();
    }
    public static void fibonacci(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter till what number you want :");
        int a = scan.nextInt();
        int one = 0;
        int two = 1;
        for (int i = 0; one<=a ; i++){
            System.out.println(one);
            int sum = one + two;
            one=two;
            two=sum;
        }
        scan.close();
    }
}
