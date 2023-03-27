package homework;

import java.util.Scanner;

public class P02MinAndMaxInputChallenge {
    public static void main(String[] args) {
        P02MinAndMaxInputChallenge obj = new P02MinAndMaxInputChallenge();
        obj.min();
    }
    public void min(){
        int largestNumber;
        int smallestNumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = scan.nextInt();
        smallestNumber=largestNumber=num;
        while(scan.hasNextInt()){
            num = scan.nextInt();
                if (num > largestNumber) {
                    largestNumber = num;
                }
                if(num < smallestNumber){
                    smallestNumber = num;
                }
                System.out.println("Smallest number is: " + smallestNumber);
                System.out.println("Largest number is: " + largestNumber);
            }
        System.out.println("Smallest number is: " + smallestNumber);
        System.out.println("Largest number is: " + largestNumber);
        scan.close();
    }
}
