/*
write a code that accepts an input of integer type, which represents the number of rows to display the Floyds Triangle pattern upto 6 rows. Display “invalid rows” without a pattern if the input given is negative:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21

Input Format

The input should be taken as row number.

Constraints

row number should be positive>0

Output Format

It should print “invalid rows” if the input taken is zero 0r less than zero.

Sample Input 0

4
Sample Output 0

1
2 3
4 5 6
7 8 9 10
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int lines;
        Scanner in = new Scanner(System.in);
        int value =1;
        lines = in.nextInt();
        if(lines <= 0){
            System.out.print("Invalid rows");
        }
        for(int i = 0; i< lines;i++){
            for(int j = 0;j<=i;j++){
                System.out.print((value++) +" ");
            }
            System.out.println();
        }
    }
}
