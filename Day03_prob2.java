/*
Amit got an assignment where he need to determine whether a given integer is prime number or not. Write a java programming solution to help Amit.

Input Format

First Line contain one integer number N

Constraints

N should be positive

Output Format

Return "Prime Number" incase integer is a prime number or return "Not Prime Number" incase it is not.

Sample Input 0

3
Sample Output 0

Prime Number
Sample Input 1

4
Sample Output 1

Not Prime Number
*/

// kirtan jain
import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), flag=0;
        sc.close();
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.println("Not Prime Number");
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Prime Number");
        }
    }
}
