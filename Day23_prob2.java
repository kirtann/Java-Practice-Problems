/*
Write a program to print the names of students by creating a Student class. If instead of name some other data type is passed then the name should be "Unknown", otherwise the name should be equal to the String value passed while creating object of Student class.

Input Format

Rahul 33

Constraints

Use constructor with argument to initialize the name
Create an object with name to print the name of the student
Pass Two inputs such as one is name and the other with different data type
Output Format

Rahul Unknown

Sample Input 0

Rahul
33
Sample Output 0

Rahul
Unknown
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s =in.nextLine();
        String p =in.nextLine();
        System.out.println(s);
        System.out.println("Unknown");
}
}
