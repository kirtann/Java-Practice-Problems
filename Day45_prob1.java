/*
Write an interface having name Calculator. It contains abstract methods add(), subtract(), multiply(), divide(). Write an anonymous class which will implement this interface and provide defination to all these methods.

Input Format

First line will contain one integer value 1,2,3 or 4. 1 represention add, 2 represents subtract, 3 represents multiply and 4 represents divide.
Second line will contain two integers on which the operation need to perform.

Constraints

First line can have only one integer value from 1-4.
Second line will contain only integer values.

Output Format

Result after operation.

Sample Input 0

4
4 4
Sample Output 0

1
Sample Input 1

7
Sample Output 1

Invalid Input
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    int divide(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // create an anonymous class that implements Calculator interface
        Calculator calc = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
            @Override
            public int subtract(int a, int b) {
                return a - b;
            }
            @Override
            public int multiply(int a, int b) {
                return a * b;
            }
            @Override
            public int divide(int a, int b) {
                if (b == 0) {
                    throw new IllegalArgumentException("division by zero");
                }
                return a / b;
            }
        };

        // read input
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        if(operation>4 || operation<1){
            System.out.println("Invalid Input");
            return;
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // perform the requested operation
        int result;
        switch (operation) {
            case 1:
                result = calc.add(a, b);
                break;
            case 2:
                result = calc.subtract(a, b);
                break;
            case 3:
                result = calc.multiply(a, b);
                break;
            case 4:
                result = calc.divide(a, b);
                break;
            default:
                System.out.println("Invalid Input");
                return;
        }

        // print the result
        System.out.println(result);
    }
}
