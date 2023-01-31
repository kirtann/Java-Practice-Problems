/*
Peter is teaching ABCD.. to his younger brother through a game. The rules of the game include peter speaking 2 characters, and expecting his brother to speak all the alphabets in between based on the following conditions.
The two characters should be alphabets, in either case.
First alphabet should be smaller.
In all other cases ERROR should be displayed.

Input Format

two alphabets as input

Constraints

The two characters should be alphabets, in either case.
First alphabet should be smaller.
In all other cases ERROR should be displayed.

Output Format

Aplhabets in between or ERROR.

Sample Input 0

H X
Sample Output 0

H I J K L M N O P Q R S T U V W X
*/


// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        // System.out.println(a+" "+b);
        if(((a>='a' && a<='z') || (a>='A' && a<='Z')) && ((b>='a' && b<='z') || (b>='A' && b<='Z'))){
            for(char i=a;i<=b;i++){
                System.out.print(i+" ");
            }
        }
        else{
            System.out.print("ERROR");
            
        }
    }
}
