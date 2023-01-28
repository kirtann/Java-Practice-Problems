/*
Shivam is friend of Keshav. Shivam visited Keshav house because he got to know that Keshav is not well. Keshav's Mother told that Shivam have temprature 40 degree Celsius. Shivam is confused that at 40 degree celsius how Keshav can have fever. He want to convert it into Fahrenheit. Help him to solve the problem.

Input Format

First line will contain an integer representing to temperature in Celsius.

Constraints

Input will be integer value between 30 to 45.

Output Format

One float value representing temprature in Fahrenheit.

Sample Input 0

38
Sample Output 0

100.4
Sample Input 1

47
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
        int c = sc.nextInt();
        double f = ((double)c * 9/5) + 32;
        if(c>=30 && c<=45)
            System.out.println(f);
        else
            System.out.println("Invalid Input");
    }
}
