//5. Finding factorial of a number entered by user

import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args){
        int num;
        long factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number :");
        num = scanner.nextInt();

        //factorial of 5 = 1*2*3*4*5
        for(int i =1; i <= num; ++i)
        {
           factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
