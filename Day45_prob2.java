/*
You are given a class Solution and an inner class Inner.Private. The main method of class Solution takes an integer as input. The powerof2 in class Inner.Private checks whether a number is a power of . You have to call the method powerof2 of the class Inner.Private from the main method of the class Solution.

Input Format

8

Constraints

1<=num<=2^30

Output Format

8 is power of 2

Sample Input 0

67
Sample Output 0

67 is not a power of 2
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    class Inner {
        boolean check(long n){
            for(int i=0;i<30;i++){
                if(Math.pow(2,i)==n){
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Solution ob = new Solution();
        Solution.Inner obj = ob.new Inner();
        if(obj.check(n)){
            System.out.println(n + " is power of 2");
        }
        else{
            System.out.println(n+ " is not a power of 2");
        }
    }
}
