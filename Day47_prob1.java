/*
Prerna is playing game of number division with her friend , taking 2 input numbers both are of numeric type only. Prerna defines rules for game is like that if second number is zero then it will print A whereas A defines Arithmetic Exception and if second number is not zero then it simply print its result and that is also of numeric type.

Input Format

In first line , enter first number. In second line , enter second number

Constraints

both the input numbers must be integer

Output Format

Output depends upon second number, if it is 0 then it will print A which means Arithmetic Exception, but if second number is not zero then it will print result of division.

Sample Input 0

34
0
Sample Output 0

A
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("A");
        }
    }
}
