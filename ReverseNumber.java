//4. Reverse a number using for Loop

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        int num, reversed = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers :");
        num = scanner.nextInt();

        for(;num != 0; num /= 10)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Numbers are : " + reversed);
    }
}
