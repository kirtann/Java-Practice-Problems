/*
Alex has a friend from India .He want to save the Mobile number of his friend with 91 extension .Help Alex to store the contact number of his friend in apporpriate mannner and If the number is valid then print "Number Saved” else print ”Enter Valid Number”.

Input Format

In First input line, you should enter contact number of Alex friend.

Constraints

Enter only positive value.
N

Output Format

Print “Number Saved” else print ”Enter Valid Number”.

Sample Input 0

919872436366
Sample Output 0

Number Saved
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.charAt(0)=='9' && str.charAt(1)=='1' && str.length()==12){
            System.out.println("Number Saved");
        }
        else{
            System.out.println("Enter Valid Number");
        }
    }
}
