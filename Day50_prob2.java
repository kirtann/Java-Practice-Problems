/*
Ram asked hari ,you speak sentence and i will count the number of words present in that sentence.
Help rama to write this program using lambda Expresssion.

Input Format

First line will accept a String

Example

Input
====
I am a boy

Outpt
=====
4

Constraints

input must be a string

Output Format

output will be the number of words present in the string

Sample Input 0

i am a student
Sample Output 0

4
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

interface Int {
    int method(String str);
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        Int obj = (str)->{
            String[] s = str.split(" ");
            return s.length;
        };
        System.out.println(obj.method(st));
    }
}
