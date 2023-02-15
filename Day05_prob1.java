/*
Write a java program that performs the following steps. a. Declare two int variables named x and y. b. Assign input taken from user to x. c. Assign twice the value of x to y. d. Interchange the value of x and y. e. Print the values of both variables on screen.

Input Format

a positive integer value

Constraints

a positive integer value

Output Format

display 2 integers as per instructions on the screen

Sample Input 0

5
Sample Output 0

10 5
Sample Input 1

10
Sample Output 1

20 10
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(2*n+" "+n);
    }
}
