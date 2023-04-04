/*
During the discussion on Lambda Expressions, Dr. Wangdu told the students that Lambda Expressions can be passed as an argument to represent the Object of any Functional Interface.

He defined a functional interface Test with an abstract method int count(int [] arr) and asked his students to implement 2 Lambda expressions one to count all the prime numbers in an array and second to count all the even numbers of the array which are divisible by 5.

A class Demo is given with a method void count(Test ob) Help the students to complete the given code.

Input Format

First line reads the number of elements N in the array
Second line reads the N integers separated by SPACE

Constraints

N > 0 and N < 10

Output Format

Prints the number of PRIME NUMBERS in the array and COUNT of all the even numbers separated by SPACE

Sample Input 0

5
11 3 15 8 10 
Sample Output 0

2 1
*/

// Kirtan Jain
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface Test
{
    int count(int [] arr);
}

class Demo{
    void count(Test ob, int [] arr){
        System.out.print(ob.count(arr)+" ");
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Demo ob1 = new Demo();
        ob1.count(arr->{
            int ans1=0;
            for(int i=0;i<arr.length;i++){
                int flag=0;
                if(arr[i]==1){
                    continue;
                }
                for(int j=2;j<arr[i];j++){
                    if(arr[i]%j==0){
                        flag=1;
                    }
                }
                if(arr[i]!=0 && flag==0){
                    ans1++;
                }
            }
            return ans1;
        }, a);
        ob1.count(arr->{
            int ans2=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0 && arr[i]%10==0){
                    ans2++;
                }
            }
            return ans2;
        }, a);
    }
}
