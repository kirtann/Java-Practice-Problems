/*
Riya asked her friend to make calculator using nested class using the following operation.
1. The outer class name is Outer_Calculator
2. The inner class name is static Inner_Calculator with four method addition , subtraction , multiplication and division.
3. Write main method under the class of Outer_Calculator.

if the input is integer than display the massage as "invalid input" and if the operator is not valid operator than display the massage as "invalid operator".

Input Format

Line 1: Read 1st Number
Line 2: Read 2nd Number
Line 3: Read Operator

Constraints

Number n1, n2 > 0
Operator : +, -, *, / (any one)

Output Format

Display the result

Sample Input 0

4
5
+
Sample Output 0

9
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {
   public static class Inner_Calculator{
        public int addition(int a ,int b){ return (a+b); };
        public int subtraction(int a ,int b){ return (a-b); };
        public int multiplication(int a ,int b){ return (a*b); };
        public int division(int a ,int b){ return (a/b); };
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a ,b;
        if(read.hasNextInt()) 
            a = read.nextInt();
        else{
            System.out.println("invalid input");
            return ;
        }
        if(read.hasNextInt()) 
            b = read.nextInt();
        else{
            System.out.println("invalid input");
            return ;
        }
        read.nextLine();
        String s = read.nextLine();
        char c = s.charAt(0);
        Inner_Calculator obj = new Inner_Calculator();
        if(c == '+')
            System.out.println(obj.addition(a ,b));
        if(c == '-')
            System.out.println(obj.subtraction(a ,b));
        if(c == '/')
            System.out.println(obj.division(a ,b));
        if(c == '*')
            System.out.println(obj.multiplication(a ,b));
        else if(c!='+'&&c!='-'&&c!='/'&&c!='*')
            System.out.println("invalid operator");
        read.close();
    }
}
