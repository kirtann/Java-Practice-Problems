/*
Mrs. Jhunjhunwala has taught Programming in Java to the second-year students in ICE college and conducted 3 academic tasks for all the (N) students. Marks are store in a 2-D array but now Mrs. Jhunjhunwala is willing to implement a java program which can accept the 2-D array of marks and return the average marks of Best 2 Academic Tasks of each student. Help her to implement a method public double[] average_marks(double [][] marks)

Input Format

First line reads the number of students N
Next N lines read the marks of each student seperated by space

Constraints

n>0

Output Format

Prints the Avaerage marks of best 2 Academic tasks of N students separated by space

Sample Input 0

2
10.5 2.5 15
5.25 6.75 11.25
Sample Output 0

12.75 9.0
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] marks= new double[3];
        for(int i=0;i<n;i++){
            for(int j=0;j<marks.length;j++){
            marks[j]=sc.nextDouble();
            }
            Arrays.sort(marks);
            System.out.print((marks[2]+marks[1])/2+" ");
        }
        
    }
}
