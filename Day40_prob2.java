/*
In a class, the teacher while teaching word formation to students thaught of an activity where two participants are choosen from the class. Participant 1 is asked to speak any english word, the participant 2 is again asked the same. After 2 words are choosen, it is checked by the class whether the starting 3 characters of word match the ending three characters in reverse order. WRITE A PROGRAM code for the teacher to perform the activity and return the appropriate message.

Input Format

Line 1 of input takes a String spoken by participant 1 of the game. Line 2 of input takes a String spoken by participant 2 of the game.

Constraints

The words choosen by the participants should be of minimum 3 length, otherwise display "ERROR".

Output Format

The mismatch should display "TRY NEXT TIME" and the match should display "GREAT".

Sample Input 0

HI<br>
IH
Sample Output 0

ERROR
Sample Input 1

HELLO<br>
TABBOULEH
Sample Output 1

GREAT
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        if(s1.length()<3 || s2.length()<3){
            System.out.println("ERROR");
            return;
        }
        String sub = s1.substring(0, 3), sub1 = s2.substring(s2.length()-3);
        if(sub.charAt(0)==sub1.charAt(2) && sub.charAt(1)==sub1.charAt(1) && sub.charAt(2)==sub1.charAt(0)){
            System.out.println("GREAT");
        }
        else{
            
            System.out.println("TRY NEXT TIME");
        }
        
    }
}
