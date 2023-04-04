/* 14. Write a program to calculate the sum of following series where n
is input by user. (where n is a positive integer and input by user.)
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n */

import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n = scanner.nextInt();

        double i, s = 0.0;
        //function to return sum of 1 + 1/2 +1/3 + ..... + 1/n
        for(i = 1; i<=n; i++)
        {
            s = s + 1/i;
        }
        System.out.println("Sum of n number is : " + s);
    }
}
