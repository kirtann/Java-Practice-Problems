/*
Rohit is pursuing his B.Tech degree in CSE. His java teacher given the assignment to write java code to accept a string/sentence in upper case if the string/sentence in not upper case than convert it in uppercase and Display the longest word and the length of the longest word present in the string. If the string contains number or string is null then display the massage “Invalid input”.
Sample 1:
Enter string: Lovely Professional University
Longest word : PROFESSIONAL

Sample 2:
Enter string: 123 cse 45 lpu 56789
Invalid input

Input Format

First line read the input as String

Constraints

numbers of word in string > 1

Output Format

Display longest string in Uppercase

Sample Input 0

Lovely Professional University
Sample Output 0

PROFESSIONAL
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String[] st = sc.nextLine().split(" ");
        int max = 0;
        char[] arr = new char[60];
        String ans = "@";
        for(int i=0;i<st.length;i++){
            arr = st[i].toCharArray();
            if(st[i].length()<=1){
                System.out.println("Invalid input");
                return;
            }
            for(int j=0;j<arr.length;j++){
                if(Character.isDigit(arr[j])){
                    System.out.println("Invalid input");
                    return;
                }
            }
            if(max<=arr.length){
                max=st[i].length();
                ans=st[i].toUpperCase();
            }
        }
        System.out.println(ans);
    }
}
