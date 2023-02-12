/*
Alex has got a Mathematical assignment where he has to find whether a given integer N is a Perfect Cube or not.Write a Java program solution to help Alex

Input Format

First line will contain an integer N

Constraints

N>1 & N<1000

Output Format

return "Perfect Cube" If given integer is a perfect Cube or "Not Perfect Cube" incase it is not

Sample Input 0

125
Sample Output 0

Perfect Cube
Sample Input 1

515
Sample Output 1

Not Perfect Cube
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(), flag=0;
        for (int i = 0; i <= N; i++) {
     
            int cube = i * i * i;
     
            if (cube == N) {
                flag=1;
                System.out.println("Perfect Cube");
                break;
            }
        }
        if(flag==0){
            System.out.println("Not Perfect Cube");
        }
    }
}
