/*
Santosh want to find the sum of prime number from 1 to given number, So help him to find the solution using java programing langauge.
if the number is less than 0 or greater than 1000 than the result should be display zero(0).

Input Format

Line 1: Enter the end range: 50

Constraints

1 < n >1000

Output Format

The Sum of Prime Numbers from 1 to 50 is: 328

Sample Input 0

50
Sample Output 0

328
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        int sum =0;
        if(num >0 && num <= 1000){
        for(int i =2;i <= num;i++){
            if(checkPrime(i)){
                sum += i;
            }
        }
        }
        System.out.println(sum);
    }
     static boolean checkPrime(int x){
        boolean valid = true;
        for(int i =2 ;i <= Math.sqrt(x);i++){
            if(x%i == 0){
                valid =false;
                break;
            }
        }
        return valid;
    }
}
