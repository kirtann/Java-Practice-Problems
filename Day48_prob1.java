/*
Deepak and Rachit are playing a game. Deepak will tell the three integers representing three sides of right angled triangle. Right angled Triangle have a rule that it always follows Pythagoras Theorem (Base^2 * Perpendicular^2 = Hypotenuse^2). Rachit need to check that whether the input provided by Deepak follows this rule or not. Write a program to help the Rachit to identify Triangle is Right angled or not. It will throw InvalidRightAngleTriangle exception when input is not following it.

Input Format

Three integer values representing three sides of triangle.

Constraints

Sides can not be greater than 20.

Output Format

Valid Triangle/ Invalid Triangle/ Invalid Input
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
        if(a>=b && a>=c){
            if(a*a == (b*b + c*c)){
                System.out.println("Valid Triangle");
                return;
            }
        }
        if(b>=a && b>=c){
            if(b*b == (a*a + c*c)){
                System.out.println("Valid Triangle");
                return;
            }
        }
        if(c>=b && c>=a){
            if(c*c == (b*b + a*a)){
                System.out.println("Valid Triangle");
                return;
            }
        }
        System.out.println("Invalid Triangle");
    }
}
