/*
Akash is found of collecting unique coins. Every coin has a denomination i.e Z. One Afternoon, he has K coins. He wnat to arrange K coins in non-increaasing order as per denomination. Write a programming solution to help akash. - Note: Use Insertion Sort

Input Format

1st line contain K Coins
2nd line contain space separated denomination from K coins
Constraints

K>0 & K<50
Z>0 & Z<100
Output Format

space separated sorted denomination from K coins

Sample Input 0

5
10 4 3 7 8
Sample Output 0

10 8 7 4 3
*/

// kirtan jain
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), flag=0;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
