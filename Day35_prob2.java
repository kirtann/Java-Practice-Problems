/*
In an activity conducted in a kids school, the students are told to carefully read the sentence written on the white board and convert each word's first alphabet to capital. Note that the first letter of the last word should be small.

Input Format

Input takes a String containing words separated with spaces.

Constraints

String with no " " delimiter should display "ERROR" message.

Output Format

The string in the output should have first word capitalized for each word, except the last word.

Sample Input 0

Sia sings a song
Sample Output 0

Sia Sings A song
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = s.length;
        if(n==1){
            System.out.println("ERROR");
            return;
        }
        for(int i=0;i<n-1;i++){
            System.out.print(s[i].substring(0,1).toUpperCase()+s[i].substring(1)+" ");
        }
        System.out.print(s[n-1].substring(0,1).toLowerCase()+s[n-1].substring(1));
    }
}
