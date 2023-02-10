
package main;

import java.util.*;

/**
 *
 * @author 84859
 */
public class Part2 {
    public static void main(String[] args) {

        double num1, num2;
        String option;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number1: ");
        num1 = sc.nextDouble();
        System.out.print("Input number2: ");
        num2 = sc.nextDouble();
        System.out.print("Operator(+-*/): ");
        option = sc.next();

        
        while (true) {
            if (option.equals("+")) { //"___.equals(đối tượng so sánh)"
                System.out.println("The result of " + num1 + option + num2 + " = " + (num1 + num2));
                break;
            }
            if (option.equals("-")) {
                System.out.println("The result of " + num1 + option + num2 + " = " + (num1 - num2));
                break;
            }
            if (option.equals("*")) {
                System.out.println("The result of " + num1 + option + num2 + " = " + (num1 * num2));
                break;
            }
            if (option.equals("/")) {
                System.out.println("The result of " + num1 + option + num2 + " = " + (num1 / num2));
                break;
            }
            System.out.printf("Input the operator(+-*/) again: ");
            option = sc.nextLine();
        }
        //            switch (option) {
//
//                case "+": {
//                    System.out.println(num1 + option + num2 + " = " + (num1 + num2));
//                    break;
//                }
//                case "-": {
//                    System.out.println(num1 + option + num2 + " = " + (num1 - num2));
//                    break;
//                }
//                case "*": {
//                    System.out.println(num1 + option + num2 + " = " + (num1 * num2));
//                    break;
//                }
//                case "/": {
//                    System.out.println(num1 + option + num2 + " = " + (num1 / num2));
//                    break;
//                }
//                default:
//                    System.out.println("Not support yet");
//
//    
    }
}
