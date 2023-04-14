/*
Rahul has implemented Puzzle Game in Java in which he wants to read a 2 digit number from the user at runtime. He wanted to implement exception handling if the user enters a number which is not a 2-digit number.

He has decided that if any user enters any incorrect number then generate NumberFormatException and allow the user to re-enter the number with a message Please Re-enter a 2 digit number.

If the user again enters an incorrect input then print You are not authorized to play the game. Help Rahul to implement the exception handling using nested try-catch block.

If user enters a valid input in any of the 2 attempts then print Your Input is XY. (where XY is the 2-digit number entered by the user)

Input Format

First line reads the original number entered by the user
Second line reads the number re-entered by the user

Constraints

Number > 0

Output Format

Prints

if the Valid Input is given by the user in first attempt

    Your Input is XY 
if the Valid Input is given by the user in Second attempt

    Please Re-enter a 2 digit number
    Your Input is XY
if the Valid Input is not given by the user in Both attempts

    Please Re-enter a 2 digit number
    You are not authorized to play the game
Sample Input 0

25
102
Sample Output 0

Your Input is 25
Sample Input 1

100
10
Sample Output 1

Please Re-enter a 2 digit number
Your Input is 10
Sample Input 2

100
200
Sample Output 2

Please Re-enter a 2 digit number
You are not authorized to play the game
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int flag=0;
        // int[] a = new int[50];
        while(sc.hasNextLine()){
            String a = sc.nextLine();
            int b = Integer.parseInt(a);
            if(b<100 && b>9){
                System.out.println("Your Input is " + b);
                flag+=2;
                break;
            }
            else if(flag==0){
                flag++;
                System.out.println("Please Re-enter a 2 digit number");
            }
        }
        if(flag<=1){
            System.out.println("You are not authorized to play the game");
        }
        

    }
}
