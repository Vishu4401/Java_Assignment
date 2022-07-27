package phase1.java;

import java.util.Scanner;

class ArithmeticCalculator {
  public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    Scanner op = new Scanner(System.in);

    System.out.println("Select an operator to perform an operation: +, -, *, or /");
    operator = op.next().charAt(0);

    System.out.println("Enter the First number");
    number1 = op.nextDouble();

    System.out.println("Enter the Second number");
    number2 = op.nextDouble();

    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("This is an invalid operator!");
        break;
    }

    op.close();
  }
}