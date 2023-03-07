/*
Ask the user to give his/her the Gmail id , check Gmail id is in proper format or not ? and count the number of charecters excluding @gmail.com
let rules for valid mail id are
1. only special symbol allowed is (.) and that must not be in staring or ending.
2. @gmail.com must be prsent at last.

Input Format

First line must be a mail id

for Example

Input Format
bhimasen.moharana@gmail.com

Output Format
valid 17

Constraints

input must be a Gmail id

Output Format

First line prints "valid" or "invalid"
Secondline prints Number of chars presenst inthe mail id excluding @gmail.com

Sample Input 0

bhimasen.moharana@lpu.co.in
Sample Output 0

invalid
17
Explanation 0

invalid because it is not a Gmail id.
and number of charecter =17
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = '.';
        int cnt = 0, count=0;
        
        for ( int i = 0; s.charAt(i) != '@'; i++) {
            if (s.charAt(i) == ch)
                cnt++;
            count++;
        }
        
        if(s.endsWith("@gmail.com") && cnt<=2 && s.charAt(0)!='.' && s.charAt(count-1)!='.'){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
        System.out.println(count);
    }
}
