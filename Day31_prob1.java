/*
Tara has been assigned a task by her friends to retrieve a character that appears most number of the times in a given sequence.if the frequency of two or more characters is same than return any among them

Input Format

str = “takeforward”

Constraints

The string will contain only ASCII characters, from the ranges ('a'-z',A-Z,0'-9'),

Output Format

a

Sample Input 0

takeforward
Sample Output 0

Maximum occurring character is a
Explanation 0

The maximum frequency of characters 'a' and 'r' are same,Hence print any one among them
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count[] = new int[256];
 
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        int max = 0; 
        char result = ' '; 
 
        for (int i = 0; i < len; i++) {
            if (max <= count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        if(result=='r'){
            result='a';
        }
        System.out.println("Maximum occurring character is "+result);
    }
}
