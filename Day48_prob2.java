/*
Karuna was asked by his Team-Leader to define a User-defined exception class named as IncorrectPasswordException which prints a message Password must contain minimum 8 characters when getMessage() is called.

Team-Leader has written a code which reads the password from the user and checks the password. If the Password is having less than 8 characters then throws the IncorrectPasswordException. He has applied the exception handling such that in catch block the getMessage() of Exception is called.

Your Password ABCDEFGHIJ is accepted should be printed if the Valid Password is entered by the user. (where ABCDEFGHIJ is the password entered by the user)

Input Format

Reads the Password as the first line Example: X1Y2Z3A4

Constraints

SPACE is also accepted as a character in password

Output Format

Prints If password is having 8 or more characters

Your Password X1Y2Z3A4 is accepted
if Password in not valid

Password must contain minimum 8 characters
Sample Input 0

1234567
Sample Output 0

Password must contain minimum 8 characters
Sample Input 1

X1Y2Z3A4123
Sample Output 1

Your Password X1Y2Z3A4123 is accepted
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()>=8){
            System.out.println("Your Password " + str + " is accepted");
        }
        else{
            System.out.println("Password must contain minimum 8 characters");
        }
    }
}
