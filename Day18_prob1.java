/*
write a program that creates integer array of n elements, accepts the values of arrays and print the array in reverse :

Input Format

Accepts n values from the user.

Constraints

All number should be integer values (Positive, negative and zero)

Output Format

It should first display original array and after reversing the array it should display the reverse array.

Sample Input 0

8 7 4 3
Sample Output 0

3 4 7 8
*/

// kirtan jain
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     //  String input = "";//get the input
      String str[] = br.readLine().split(" ");
        for(int i = str.length-1;i>=0;i--){
            System.out.print(str[i] +" ");
        }
    }
}
