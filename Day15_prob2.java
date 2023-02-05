/*
Neha and Nisha are playing a game .Nisha ask Neha to enter the number N from given range of 0 to 99 .Now Nisha need to print the number till N and once it exceed the number from N then Print "Games End".If Neha enter the number less then 0 print Invalid input.

Input Format

Program should take the input for Number N.

Constraints

0>=N<100

Output Format

Print the number till N and if the range of N exceed print "Games End”.If Neha enter the number less then 0 print "Invalid Input".

Sample Input 0

5
Sample Output 0

0
1
2
3
4
5
Games End
Sample Input 1

-10
Sample Output 1

Invalid Input
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=0){
            for(int i=0;i<=a;i++){
                System.out.println(i);
            }
            System.out.println("Games End");
        }
        else{
            System.out.print("Invalid Input");
        }
    }
}
