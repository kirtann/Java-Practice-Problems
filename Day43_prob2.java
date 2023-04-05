/*
Rahul, Ramu and Ramesh where creating 3 different Function interface with multiple parameters, further Rahul did addition operation with multiple parameters, Ramu did multiplication operation with multiple parameters and Ramesh passed string message of the answers what Rahul and Ramu got in terms of words

Input Format

2 4

Constraints

Use 3 different types of functional interface for addition, multiplication operation with multiple parameters and one for passing the string message.
Use Only Lambda expression for addition, multiplication operations and passing the string message
Output Format

6
8
six eight

Sample Input 0

2 4
Sample Output 0

6
8
six eight
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

interface Rahul {
    int add(int a, int b);
}
interface Ramu {
    int mul(int a, int b);
}
interface Ramesh {
    String str(int a);
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        Rahul obj1 = (a,b)->{
            return a+b;
        };
        int ans1=obj1.add(n, m);
        Ramu obj2 = (a,b)->{
            return a*b;
        };
        int ans2=obj2.mul(n, m);
        
        Ramesh obj3 = (a)->{
            String[] digits = new String[] {
                "zero", "one", "two",   "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten","eleven","twelve","thirteen","fourteen",
                "fifteen","sixteen","seventeen","eighteen", "nineteen"
            };
            
                return (digits[a]);
            
        };
        String s1=obj3.str(ans1),s2=obj3.str(ans2);
        
        System.out.println(ans1+"\n"+ans2+"\n"+s1+" "+s2);
    }
}
