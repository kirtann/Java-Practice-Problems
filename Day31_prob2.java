/*
Kumar has been given a string and asked to determine whether it can be converted into a palindrome after removing at most one characte

Input Format

str="abcbea"

Constraints

1<=Str.length<=10^3 Str consists of Lowercase English characters

Output Format

true

Sample Input 0

abceba
Sample Output 0

true
Explanation 0

you can remove character 'e' to make it palindrome
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count=0;
        String a = sc.nextLine();
        for(int i=0;i<Math.ceil(a.length()/2);i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                count++;
            }
            
        }
        if(count>1){
            System.out.println(false+" ");
        }
        else{
            System.out.println(true+" ");
        }
    }
}
