/*
Ask rahul to give two of his friends name.and help rahul to count the number of vowels present in these two names. if no vowels present thent print "0".
Example

Input

ramesh
tushar

Output

4

Input Format

first line accept first Name
second line accept 2nd Name

Constraints

name must contain alhabates only.

Output Format

First line must be no of Vowels presnt in both the names.

Sample Input 0

ramesh
suresh
Sample Output 0

4
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int result = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'){
                result++;
            }
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='a' || s2.charAt(i)=='e' || s2.charAt(i)=='i' || s2.charAt(i)=='o' || s2.charAt(i)=='u'){
                result++;
            }
        }
        System.out.print(result);
    }
}
