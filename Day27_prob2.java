/*
Richa and her daughter Ahaana are playing a game. Richa is going to tell one number and Ahaana need to tell the prime factors of the number. Help Ahaana by completing the code to find prime factor of the number. Write a method which calculate prime factors and print and call the method in main.

Input Format

An integer value

Constraints

N will be lie between 10-50

Output Format

All the prime factors will be printed exectly once with space.
*/

// kirtan jain
import java.io.*;
import java.util.*;
public class Solution 
{
    static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    static void printPrime(int nn)
    {
        int temp;
        for(int i=2;i<=nn;i++)
        {
            temp = nn%i;
            if(temp==0)
            {
                if(isPrime(i))
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>10 && n<50)
        {
            printPrime(n);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
