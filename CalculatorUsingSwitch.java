/*7. Making Calculator using the switch statement(The program takes three
        inputs from the user: one operator and 2 numbers. Based on the
        operator provided by the user, it performs the calculation on the
        numbers. Then the result is displayed on the screen.) */

import java.util.Scanner;
public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        char operator;
        Double num1, num2, result;

        //create an object of scanner class
        Scanner input = new Scanner(System.in);

        //ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        //ask user to enter numbers
        System.out.println("Enter first number");
        num1 = input.nextDouble();

        System.out.println("Enter second number");
        num2 = input.nextDouble();

        switch (operator) {

            //perform addition between numbers
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            //perform subtraction between numbers
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            //perform multiplication between numbers
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            //perform division between numbers
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }
}






