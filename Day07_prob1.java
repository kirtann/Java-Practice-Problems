/*
Joy is in fun center and a task is given to him that he need to write a number and tells that whether that number is even or odd. Help him to create an application for him in which he need to write a number and corresponds to it application will display message as “Number is odd” or “Number is even”.

Input Format

In first line, a number is to be entered

Constraints

Only integer number can be entered.

Output Format

According to input, application will print “number is even” or “number is odd”.

Sample Input 0

6
Sample Output 0

Number is even
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2==0)
             System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}
