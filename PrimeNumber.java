//3. Program to check whether input number is prime or not

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        int n, temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        n = scanner.nextInt();

        //prime number is divided by 1 and number by itself
        for (int i=2; i<=n-1; i++){
            if (n%i==0){
                temp = temp + 1;
            }
        }
        if(temp>0)
        {
            System.out.println("Entered number is not a prime number.");
        }
        else
        {
            System.out.println("Entered number is a prime number.");
        }
    }
}
