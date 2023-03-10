/*
Write a program to check whether two strings are ANAGRAM or not. Strings will be anagram if they have same set of characters same number of times. Your program should take the input of two strings of length greater than 2. If the length of the any string is less than equal 2 then display the message “Invalid Input” without taking any more input.

Input Format

Your program should take the input of two strings.

Constraints

Length of strings should be greater than 2.

Output Format

Your program should display the “ANAGRAM” or “NOT ANAGRAM” depending on the input strings.

Sample Input 0

silent
listen
Sample Output 0

ANAGRAM
Sample Input 1

ssilent
listenn
Sample Output 1

NOT ANAGRAM
*/

Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.nextLine().toCharArray();
        char[] s2 = sc.nextLine().toCharArray();
        int flag = 0;
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(s1.length<=2 || s2.length<=2){
            System.out.println("Invalid Input");
            return;
        }
        for(int i =0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("ANAGRAM");
        }
        else{
            System.out.println("NOT ANAGRAM");
        }
    }
}
