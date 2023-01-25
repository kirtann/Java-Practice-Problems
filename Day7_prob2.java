/*
A student will not be allowed to sit in exam if his/her attendence is less than 75%. Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.

Input Format

Number of classes held
Number of classes attended.

Constraints

Number of classes held >= Number of classes attended.
and both must be Positive integer

Output Format

percentage of class attended
Is student is allowed to sit in exam or not.

Sample Input 0

100
80
Sample Output 0

80
Yes
Explanation 0

Number of classes held : 100
Number of classes attended : 80
And Output
percentage of class attended : 80
Is student is allowed to sit in exam or not : Yes

Sample Input 1

50
34
Sample Output 1

68
No
Explanation 1

Number of classes held : 50
Number of classes attended : 34
And Output
percentage of class attended : 68
Is student is allowed to sit in exam or not : No
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = b*100/a;
        System.out.println((int)c);
        if(c>=75){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        } 
    }
}
