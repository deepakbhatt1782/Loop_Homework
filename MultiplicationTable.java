//10. Java Program to Print Multiplication Table for any Number

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=scanner.nextInt();

        for (int i=1; i<=10; ++i)
        {
            int ans = n * i;
            System.out.println(n+ "*" + i + " = "+ ans);

        }

    }
}
