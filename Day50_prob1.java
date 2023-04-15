/*
Suppose there is a pre-defined arrays of Strings containing 3 values: {"User", "Admin", "Guest"}. Treat these values as usernames of authentic users in the company. Write a program containing this array and then ask the user to input his username. If the input given by the user doesn't match with anyone of the array-values, then throw an object of a Custom-exception class named Authentication, which displays the message: "Unauthorized ", where will be the input given by the user at run-time. For example, if input provided by user is: "person", then "Unauthorized person" should be displayed. Otherwise, if the user input matches with anyone of the array-values, then display message: "Authorized".

Input Format

Your program should take input of username.

Constraints

Use pre-defined array : {"User", "Admin", "Guest"} in the program and only single input is required from user at run-time.

Output Format

If user is authorized then display "Authorized", otherwise display "Unauthorized ", where will be the input provided by user at run-time. For example, if input provided by user is: "person", then "Unauthorized person" should be displayed. Otherwise, if the user input matches with anyone of the array-values, then display message: "Authorized".

Sample Input 0

User
Sample Output 0

Authorized
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        if(st.equals("User") || st.equals("Admin") || st.equals("Guest"))
            System.out.println("Authorized");
        else
            System.out.println("Unauthorized " + st);
    }
}
