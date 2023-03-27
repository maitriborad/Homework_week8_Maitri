package homework;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class P08Triangle {
    public static void main(String[] args) {
        P08Triangle obj = new P08Triangle();
        obj.display();
    }
    public void display(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of rows: ");
        int n = scan.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("@");
            }
            System.out.println("");
        }
        scan.close();
    }
}
