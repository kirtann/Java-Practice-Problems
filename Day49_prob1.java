/*
Keshav and Prateek are playing a game. Keshav is going to tell the length of three sides of triangle and Prateek need to tell that whether it is valid or not. Triangle have a rule that sum of two sides is always greater than the third side. Help Prateek to identify that it is valid or not. If it is not following the rule then generate InvalidTriangleException which will be handled using try and catch.

Input Format

First line will contain three space separated integer values representing three sides of triangle.

Constraints

Maximum length of side can be 20.

Output Format

Valid Triangle/ Invalid Triangle/ Invalid Input

Sample Input 0

5 10 3
Sample Output 0

Invalid Triangle
Sample Input 1

16 21 14
Sample Output 1

Invalid Input
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a>20 || a<1 || b>20 || b<1 || c>20 || c<1){
            System.out.println("Invalid Input");
            return;
        }
        if(a<=b+c && b<=c+a && c<=a+b){
            System.out.println("Valid Triangle");
            return;
        }
        System.out.println("Invalid Triangle");
    }
}
