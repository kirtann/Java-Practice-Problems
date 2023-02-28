/*
You need to create an application for a company, who is planning to maintain passwords of his employees, so to manage passwords company officials are thinking about of python case format. In Python case format, particular String is concerted into complete lower case and space is replaced by special character “$”. In this format , password which is taken as string that must consist with more than 1 word.

Input Format

In first line , you need to enter Password

Constraints

make password is of string type only

Output Format

convert entered password into python case format which is mentioned in question statement

Sample Input 0

Hello World
Sample Output 0

hello$world
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        for(int i=0;i<s.length-1;i++){
            System.out.print(s[i].toLowerCase()+"$");
        }
        System.out.println(s[s.length-1].toLowerCase());
    }
}
