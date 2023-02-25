/*
Puneet and Virat are playing a game. Virat tells a number that Puneet need to check whether that number is even and multiple of 3 or not. Write a program in which implement a method public boolean check(int n) which will return true if number satisfy the conditions else return false.

Input Format

One integer value representing number given by Virat.

Constraints

Number will lie between 20 and 400.

Output Format

True/False according to the value returned by the method or will print Invalid Input in case of number did not match the constraints.

Sample Input 0

60
Sample Output 0

True
Sample Input 1

12
Sample Output 1

Invalid Input
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    static String check(int n){
        if(n%2==0 && n%3==0){
            return "True";
        }
        else{
            return "False";
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<20 || n>400){
            System.out.print("Invalid Input");
            return;
        }
        System.out.print(check(n));
    }
}
