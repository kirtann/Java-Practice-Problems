/*
Chacha Chaudhary has asked Sheena to find out the Nth occurence of any Word in the Paragraph. Sheena finds it a tedious task to find Nth occurence so she wants you to write a small java program which can solve her problem and she will give you a gift for helping her. Let us write a code.

Input Format

First line reads the paragraph contents

Second line reads the word to be found and N separated by Space

Constraints

N>0

Output Format

Prints the starting index of the Nth occurence of the word in the paragraph

Prints Not Present if not occuring even a single time and prints the last occurence if occuring less than N times.

Sample Input 0

Aana bought banana.
ana 1
Sample Output 0

1
Sample Input 1

Aana bought banana
baa 3
Sample Output 1

Not Present
Sample Input 2

Aana bought banana.
ba 3
Sample Output 2

12
Explanation 2

ba is occuring only 1 time i.e. at index 12. 3rd occurence is not available so output is 12 which is the last occurence.
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    static int nthOccurrence(String str1, String str2, int n) {
 
        String tempStr = str1;
        int tempIndex = -1;
        int finalIndex = 0;
        for(int occurrence = 0; occurrence < n ; ++occurrence){
            tempIndex = tempStr.indexOf(str2);
            if(tempIndex==-1){
                finalIndex = 0;
                break;
            }
            tempStr = tempStr.substring(++tempIndex);
            finalIndex+=tempIndex;
        }
        return --finalIndex;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.next();
        int n = sc.nextInt();
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = s.indexOf(s1, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += s1.length();
            }
        }
        
        if(s.lastIndexOf(s1)==-1){
            System.out.println("Not Present");
            return;
        }
        if(count<n){
            System.out.println(s.lastIndexOf(s1));
        }
        else if(n==1){
            System.out.println(s.indexOf(s1));
        }
        else{
            System.out.println(nthOccurrence(s, s1, n));
        }
        
    }
}
