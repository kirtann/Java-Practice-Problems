/*
Raju, Rohit and Ramesh were playing a game where Raju instructs Rohit to open and close two pairs of parenthesis bracket and place your name inside the bracket tags then Rohit instructs Ramesh to open and close three pairs of curly brackets and place your name inside the bracket tag then at last Ramesh instructs Raju to open and close four pairs of square brackets and place your name inside the bracket tag.

Input Format

(())
Rohit

Constraints

First user input should be bracketing tags and the next user input should be string names
In the output name should be in the middle of the bracket tags.
Output Format

((Rohit))

Sample Input 0

(())
Rohit
Sample Output 0

((Rohit))
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        for(int i=0;i<s.length()/2;i++){
            System.out.print(s.charAt(i)+"");
        }
        for(int i=0;i<s1.length();i++){
            System.out.print(s1.charAt(i));
        }
        for(int i=s.length()/2;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        
    }
}
