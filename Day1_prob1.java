/*
Write a program to take the 2 inputs of integer type from the user. Display the values separated by symbol ‘-’ if the values are positive otherwise display the message “Invalid Input”.

Input Format

Your program should take at least 2 inputs of integer type.

Constraints

Input should be positive integers

Output Format

Output should be the input values separated by ‘-‘ or “Invalid Input” message if any input is negative.

Sample Input 0

10
2
Sample Output 0

10-2
Sample Input 1

20
-10
Sample Output 1

Invalid Input
*/


// Kirtan Jain
// Display of two positive user taken number inputs with '-' sign in between. 
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=0 && b>=0){
            System.out.print(a+"-"+b);
        }
        else{
            System.out.print("Invalid Input");
        }
        
    }
}
