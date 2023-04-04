//2. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is
//n.

import java.util.Scanner;
public class FibonacciNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //taking the input to print n numbers
        System.out.println("Please enter any number : ");
        int n = scanner.nextInt();

        int a = 0 , b = 1, c;
        System.out.println(a);
        System.out.println(b);

        //using the for loop to print addition of next two values
        for (int i=0; i<=n; i++)
        {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }



    }
}
