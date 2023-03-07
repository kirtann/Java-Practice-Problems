/*
Ram was writing the essay and by mistakely he wrote in past continue tense inspite of present continue tense so write a program by using String class method to replace all.

Input Format

This was a beautiful Flower.

Constraints

All the sentences should be is the past continue sentences only.

Output Format

This is a beautiful Flower.

Sample Input 0

He was having ten pens and all pens were in good condition.
Sample Output 0

He is having ten pens and all pens are in good condition.
Sample Input 1

he is working in bank
Sample Output 1

Invalid
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.contains("is") || s.contains("are")){
            System.out.println("Invalid");
            return;
        }
        s=s.replaceAll("was","is");
        s=s.replaceAll("were","are");
        System.out.println(s);
        
    }
}
