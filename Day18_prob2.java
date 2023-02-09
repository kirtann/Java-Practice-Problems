/*
Narayana friends ask him to write a java code to find the sum of all even number which is store in one dimensional array.
if the array does not have any even number then print 0 else print the sum.

Input Format

Accept the size of array n
Enter the n number of element.

Constraints

5 < n > 50

Output Format

print the sum

Sample Input 0

5
10
15
20
35
45
Sample Output 0

30
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int sum = 0;
        int[] arr = new int[size];
        for(int i = 0 ; i <size; i++){
            arr[i] = in.nextInt();
            //in.nextLine();
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.print(sum);
    }
}
