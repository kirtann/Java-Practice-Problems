/*
Given a string S and an integer number N,
print the output in the form: "The string is :S" and "The interger is :N"
in the two separate lines.

Input Format

The first line accept a string
The Second line accept a Number

For Example

Input:
S = 'LPU'
N = 20
Output :
The string is :LPU
The integer is :20

Constraints

N is positive integer

Output Format

The string is :LPU
The integer is :20

Sample Input 0

Rama
50
Sample Output 0

The string is :Rama
The integer is :50
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int b = sc.nextInt();
        System.out.println("The string is :"+a+"\nThe integer is :"+b);
    }
}
