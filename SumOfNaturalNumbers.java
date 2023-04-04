//6. Display Sum of n Natural Number

import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int i, n, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        n = scanner.nextInt();

        //executes until the condition returns true
        for(i=1; i<=n; ++i)

        //adding the value of i into sum variables
        {
            sum = sum + i;
        }
        System.out.println("Sum of natural numbers is : " + sum);
    }
}