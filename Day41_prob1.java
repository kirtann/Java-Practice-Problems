/*
Create a functional interface with the following method in it: boolean valid(String str, int n);

Write a program with the help of lambda expression that will use this valid() method to find out if a string (str) is having characters greater than "n" in it or not.

Input Format

Your program will take 2 types of inputs. First input will be a string (i.e. value for "str") and second input will be no. of characters to compare (i.e. value for "n"). If value of "n" entered less than 1, then display message "Invalid input". Otherwise, display message "Valid string" if string is having characters greater than "n" or display message "Invalid string" if string is having characters less than "n".

Constraints

No. of characters (i.e. "n") should be greater than 0.

Output Format

Display message "Valid string" if string is having characters greater than "n" or display message "Invalid string" if string is having characters less than "n".

Sample Input 0

Lovely
4
Sample Output 0

Valid string
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

interface i1{
    boolean valid(String str, int n);
}


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int n = sc.nextInt();
        sc.close();
        if(n<1){
            System.out.println("Invalid input");
            return;
        }
        i1 obj = (String str,int m)->{
            if(str.length()>=m)
                return true;
            else
                return false;
        };
        boolean ans = obj.valid(st, n);
        if(ans){
            System.out.println("Valid string");
        }
        else{
            System.out.println("Invalid string");
        }
    }
}
