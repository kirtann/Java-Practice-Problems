/*
Jashu, Preeti, and Rita where playing a game, where they call each other randomly and they need to tell their middle character of their names. First Preeti called Jashu then Jashu called Rita then Rita called Jashu

Input Format

Jashu

Constraints

Declare name in the form of String
If the string name has odd no of character then print the middle character, if the string name has even no of character then print the middle two characters
Output Format

s

Sample Input 0

Jashu
Sample Output 0

s
*/

// kirtan jain
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length()%2==1){
            System.out.println(s.charAt(s.length()/2));
            return;
        }
        System.out.println(s.charAt((s.length()-1)/2)+""+s.charAt((s.length()-1)/2+1));
    }
}
