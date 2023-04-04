//8. write a program that prints the sum of x ranging from 1 to 20.
import java.util.Scanner;
public class SumOfRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //first number should be smaller than the second number
        System.out.println("Make sure first number should be smaller than the second number");
        System.out.println("Enter any two number between 1 to 20: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        if(a<=b)
        {
            //starting loop from value of 'a' and will run the loop until it reaches to value of 'b'
            for (int i = a; i <= b; i++)
                sum = sum + i;
            System.out.println("Sum of the range of given numbers is : " + sum);
        }
          // if user put value of a bigger than b
        else if (b <= a){
            System.out.println("Value of 'a' is bigger than 'b' so range is not possible.");
        }

    }
}
