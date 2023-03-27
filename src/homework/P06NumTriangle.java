package homework;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class P06NumTriangle {
    public static void main(String[] args) {
        P06NumTriangle obj = new P06NumTriangle();
        obj.triangle();
    }
    public void triangle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        int n = scan.nextInt();

        for(int i=1;i<=n;i++)//rows
        {
            for(int j=1;j<=i;j++) {
                System.out.print(j);//numbers
            }
            System.out.println("");//space
        }
        scan.close();
    }
}
