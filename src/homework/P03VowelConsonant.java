package homework;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class P03VowelConsonant {
    public static void main(String[] args) {
        P03VowelConsonant obj = new P03VowelConsonant();
        obj.letter();
    }
    public void letter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your letter: ");
        String l = scan.next().toLowerCase();
        if(l.length()>1){
            System.out.println("Please enter only single character");
        }else if(!(l.charAt(0)>=65 && l.charAt(0)<=90 || l.charAt(0)>=97 && l.charAt(0)<=122)){
            System.out.println("User input is not a letter");
        }else if (l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u")){
            System.out.println("This letter is vowel");
        }else{
            System.out.println("This letter is Consonant");
        }
        scan.close();
    }
}
