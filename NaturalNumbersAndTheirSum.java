//12. Write a program in Java to display n limit of natural numbers and
//their sum.

import java.util.Scanner;
public class NaturalNumbersAndTheirSum {
    public static void main(String[] args){
        int i,n, sum=0;
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number :");
            n = scanner.nextInt();
        }
        //enter first natural numbers
        System.out.println("The first n natural numbers are :" +n);
        for(i=1; i<=n; i++)
        {
            System.out.println(i);
            sum+=i;
        }
        //sum of n natural numbers
        System.out.println("The sum of Natural Number up to " +n+ " terms :" +sum);
    }
}
