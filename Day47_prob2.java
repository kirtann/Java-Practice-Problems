/*
Hari ask Rama to make an arithmatic calculator which will accpet two integer values. but at a time only one opatation(+,-,*,/) he can do.Help rama to create this using labda expression.

Input Format

First line will contain two ineteger values on which we have to perform the operation
Second line will contain one integer value which will describe the operation
1 addition
2 subtraction
3 multiplication
4 division

Constraints

number should be integer value

Output Format

one integer value represnting result of the operation if wrong input then print Invalid

Sample Input 0

7 8
2
Sample Output 0

-1
Sample Input 1

4 5
5
Sample Output 1

Invalid
*/

// Kirtan Jain
import java.io.*;
import java.util.*;


interface operation{
    int operate(Float a, Float b, Float n);
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat(), b=sc.nextFloat(), op=sc.nextInt();
        if(Math.ceil(a) != Math.floor(a) || Math.ceil(b) != Math.floor(b) || op<1 || op>4){
            System.out.println("Invalid");
            return;
        }
        operation ob = ( c, d, n)->{
            if(n==1) {
                return (int)(c+d);
            }
            else if(n==2){
                return (int)(c-d);
            }
            else if(n==3){
                return (int)(c*d);
            }
            else {
                return (int)(c/d);
            }
        };
        System.out.println(ob.operate(a,b,op));
    }
}
