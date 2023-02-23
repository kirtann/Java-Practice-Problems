/*
It's PTM tomorrow in Cambridge School.Teachers want to show the grades from(A to E) depending on the percentage of the student. Help the teacher's by developing the program for the same.To find the grade of a student, given the marks of N subjects. Given the marks of N subjects, we have to print the grade of a student based on the following grade slab.

If Percentage Marks > 90, Grade is A+ If 70 <= Percentage Marks <= 89, Grade is A If 60 <= Percentage Marks <= 69, Grade is B If 50 <= Percentage Marks <= 59, Grade is C If Percentage Marks <= 40, Grade is D

Input Format

Integer Value to enter number of subjects, count Enter marks of subjects depending upon the the total number of subjects

Constraints

Number of subjects should not exceed 7

Output Format

Character output to show grades

Sample Input 0

5
50 57 89 87 56 
Sample Output 0

B
Sample Input 1

9
Sample Output 1

Invalid
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        if(n<0 || n>7){
            System.out.println("Invalid");
            return;
        }
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        // If Percentage Marks > 90, Grade is A+ If 70 <= Percentage Marks <= 89, Grade is A If 60 <= Percentage Marks <= 69, Grade is B If 50 <= Percentage Marks <= 59, Grade is C If Percentage Marks <= 40, Grade is D
        int percent = sum/n;
        if(percent > 90){
            System.out.println("A+");
        }
        else if(percent >=70 && percent <=89){
            System.out.println("A");
        }
        else if(percent >=60 && percent <=69){
            System.out.println("B");
        }
        else if(percent >=50 && percent <=59){
            System.out.println("A");
        }
        else if(percent <= 40){
            System.out.println("D");
        }
    }
}
