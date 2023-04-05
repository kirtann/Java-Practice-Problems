/*
Create a class Person having a single attribute: age. Now, create a functional interface with the following method in it: void find(Person p[]);
Create a Demo class having main() method and ask the user to createa and initialize "n" Person objects (where "n" is input given by user). Now, use the lambda expression that will use this find() method to find out how many Persons have age greater than 25.

Input Format

Your program will take 2 types of inputs. First user input will be no. of person objects "n" to be created. Remaining user inputs will be "age" value of every Person object created. If value of "n" entered is less than 1, then display message "Invalid input" and no further input should be taken. Otherwise, display no. of persons having age greater than 25.

Constraints

Value of "n" and "age" should be greater than 0. If any invalid age (e.g. -2) is entered the user, then take 18 as the default age.

Output Format

Display no. of persons having age greater than 25. If value of "n" (i.e. no. of person objects) entered is less than 1, then display message "Invalid input".

Sample Input 0

3
26
14
30
Sample Output 0

2
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

class Person{
    public int age;
    Person(int age){
        this.age=age;
    }
}

interface S{
    void find(Person[] p);
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Invalid input");
            return;
        }
        Person[] obj = new Person[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            obj[i] = new Person(a);
        }
        S obj1 = (obje)->{
            int ans=0;
            for(int i=0;i<obje.length;i++){
                if(obje[i].age>25){
                    ans++;
                }
            }
            System.out.println(ans);
        };
        obj1.find(obj);
    }
}
