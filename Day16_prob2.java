/*
Suppose that you are asked to input the size of an array and then enter integer type elements in it. Write a program which works as follows: 1) If input of array size is less than 1, then "Invalid Array Size" should be displayed and no other input should be taken. 2) Find and print the smallest element in the array.

Input Format

Program should take 2 types of inputs in following sequence: 1) Size of array 2) Elements in array Example: 4 22 44 12 56

Constraints

Size of the array should be greater than 0. i.e. 0 < n <50

Output Format

If input of array size is negative, then "Invalid Array Size" should be displayed and no other input should be taken. If input array is: 22 44 12 56 then print smallest element as: 12

Sample Input 0

4
22 44 12 56
Sample Output 0

12
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), min=100000;
        if(n<0){
            System.out.println("Invalid Array Size");
            return;
        }
        int a1[] = new int[n];
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
            if(a1[i]<min){
                min=a1[i];
            }
        }
        
        System.out.println(min);
    }
}
