/*
Puneet and Virat are playing a game. Virat tells some numbers to Puneet. Puneet needs to find sum of all numbers which are odd and discard even numbers. Write a program in which implement a method public int sumOddNumbers(int... n) which will return the sum of all odd numbers.

Input Format

Some integer values representing numbers given by Virat.

Constraints

Number will lie between 20 and 400.

Output Format

Sum according to the value returned by the method or will print Invalid Input in case of number did not match the constraints.

Sample Input 0

 21 25 26 28
Sample Output 0

46
Sample Input 1

51 52 53 54 56
Sample Output 1

104
*/

//kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");
        int sum=0;
        for(int i=0;i<st.length;i++){
            if(st[i].equals("")){
                continue;
            }
            int a = Integer.parseInt(st[i]);
            if(a%2==1){
                sum+=a;
            }
        }
        System.out.println(sum);
        
    }
}
