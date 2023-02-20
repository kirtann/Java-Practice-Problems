/*
My son Priyanshu got an assignment from his teacher to perform multiplication of complex number.
Help him to complete his assignment. Write a java code with following features:
class Name: Complex
Instance Variable: real, imaginary (int type)
Constructor: **
1. Complex()
2. Complex(int, int)

**Instance Method:
1. Mul_Complex(Complex, Complex)
2. Display()
Read the real and imaginary from user and pass to the constructor as parameter
Write a separate class Test_Complex with a main() method and test the Complex class methods

Input Format

First line Read the complex number 1 for real and imaginary First line Read the complex number 2 for real and imaginary

Constraints

real, imaginary > 1

Output Format

Print the Result in form of complex number : a+bi

Sample Input 0

2 3
4 5
Sample Output 0

-7+22i
Sample Input 1

0 1
2 3
Sample Output 1

-3+2i
Sample Input 2

2
4 2
Sample Output 2

8+4i
*/

// kirtan jain
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Complex
{

    int real,imaginary;
    Complex()
    {
        real = 0;
        imaginary = 0;
    }
    Complex(int x,int y)
    {
        real = x;
        imaginary = y;
    }
    void mul_Complex(Complex c1,Complex c2)
    {
        //(a+bi)*(c+di) = (ac - bd) +i(ad + bc)
        this.real = (c1.real*c2.real) - (c1.imaginary*c2.imaginary);
        this.imaginary = (c1.real*c2.imaginary) + (c1.imaginary*c2.real);
    }
    void display()
    {
        System.out.println(real+"+"+imaginary+"i");
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Complex c1,c2,c3;
        String []s1 = sc.nextLine().replaceAll("\\s+$","").split(" ");
        String []s2 = sc.nextLine().replaceAll("\\s+$","").split(" ");

        int r1 = Integer.parseInt(s1[0]);
        int r2 = Integer.parseInt(s2[0]);
        int i1,i2;
        if(s1.length==1)
            i1 = 0;
        else
            i1 = Integer.parseInt(s1[1]);

        if(s2.length==1)
            i2 = 0;
        else
            i2 = Integer.parseInt(s2[1]);
        c1 = new Complex(r1,i1);
        c2 = new Complex(r2,i2);
        c3 = new Complex();


        c3.mul_Complex(c1,c2);
        c3.display();
    }
}
