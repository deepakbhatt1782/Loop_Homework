//1. Print any 10 numbers between given/user input range. For eg. Print
//numbers between 23-33

import java.util.Scanner;
public class PrintNextTenNumbers {
    public static void main(String[] args) {

        System.out.println(" Enter any number : ");
        Scanner scanner = new Scanner(System.in);
        // initial number entered by user to print next 10 numbers
        int x = scanner.nextInt();
        int j = x+10;

        //using For loop to add next 10 numbers
        for (int i = x; i <= j; i++) {
            System.out.print( i+1 + " ");
        }
    }
}
