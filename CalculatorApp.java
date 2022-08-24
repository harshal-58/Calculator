

import java.util.*;
class SimpleCalculator {
public int addition(int i, int j) {
        System.out.println("Addition of " + i + "," + j + " is: " + (i + j));
        return i + j;
    }
public int multiplication(int i, int j) {
        System.out.println("Multiplication of " + i + "," + j + " is: " + (i * j));
        return i * j;
    }
public int substract(int i, int j) {
        System.out.println("Subtraction of " + i + "," + j + " is: " + (i - j));
        return i - j;
    }
public double divide(double i, double j) {
        if (j != 0) {
            System.out.println("Division of " + i + "," + j + " is: " + (i / j));
            return i / j;
        } else {
            System.out.println("Division with 0 is not possible");
            return 0;
        }
    }
}
public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Simple Calculator");
        System.out.println();
        SimpleCalculator cal = new SimpleCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        cal.addition(a, b);
        cal.multiplication(a, b);
        cal.substract(a, b);
        cal.divide(a, b);
        sc.close();
    }
}
