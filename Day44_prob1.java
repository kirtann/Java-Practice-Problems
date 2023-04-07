/*
Create a functional interface Predicate with an abstract method test with following signature: boolean test(String t); Write a test program to filter all the strings present in group of strings which ended with character ‘g’ by using above test method with the help of lambda expression.

Input Format

Your program should take 2 types of inputs. First will represents the number of Strings and second will be the objects of Strings. If the number of strings will be less than equal 1 then display the message “Invalid” without asking for any input.

Constraints

Number of strings should be greater than 1

Output Format

Should be list of the strings in separate lines which are ended with character ‘g’

Sample Input 0

5
Gang
Spring
Java
Live
Swing
Sample Output 0

Gang
Spring
Swing
Sample Input 1

1
Sample Output 1

Invalid
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

interface Predicate {
    boolean test(String t);
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<2){
            System.out.println("Invalid");
            return;
        }
        Predicate obj=(st)->{
            if(st.charAt(st.length()-1)=='g'){
                return true;
            }
            else{
                return false;
            }
        };
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s=sc.nextLine();
            if(obj.test(s)){
                System.out.println(s);
            }
        }
        
    }
}
