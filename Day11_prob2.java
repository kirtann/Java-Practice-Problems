/*
Rajiv asked his friend to write a java code to check the given number is palindrom are not?
if the number is less than 9 or greater than 9999 than return "invalid input"

Sample 1:
Enter the number : 121
number is palindrome

Sample 2:
Enter the number : 122
number is not palindrome

Sample 3:
Enter the number : 7
invalid input

Input Format

first line of the input reads the number

Constraints

9 < n > 9999

Output Format

prints whether the number is palindrome or not.
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n<9 || n>9999){
            System.out.print("invalid input");
        }
        else{
            int rev=n;
            int m=0;
            while(n>0){
                m+=n%10;
                m*=10;n/=10;
            }
            m/=10;
            if(rev==m)
                System.out.println("number is palindrome");
            else
                System.out.println("number is not palindrome");
        }
    }
}
