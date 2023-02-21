/*
Create a java class containing two methods. The first add method receives two integer arguments and second add method receives two String arguments. Both methods are named as add() and perform the addition of their parameters or concatenate strings when called. The user should press 1 or 2 to call respective methods and input of 2 integers or 2 strinngs is taken according to the methods called.

Input Format

1 or 2 to be taken in first line of input
second line accepts 2 int type inputs, when 1 is pressed or take 2 String type inputs when 1 is pressed.

Constraints

user never presses a number apart from 1 or 2 in first line.

Output Format

if a number entered in first line is not 1 or 2, display ERROR and exit. otherwise add 2 int numbers if 1 is pressed, or concatenate 2 strings if 2 is chosen

Sample Input 0

1
12 23
Sample Output 0

35
*/

// kirtan jain
import java.io.*;
import java.util.*;
public class Solution {
    static int add(int a,int b
    {
        return a+b;
    }
    static String add(String a, String b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if(choice==1)
        {
            int a1 = in.nextInt();
            int a2 = in.nextInt();
            int res = add(a1,a2);
            System.out.print(res);
        }
        else if(choice==2)
        {
            in.nextLine();
            String s = in.nextLine();
            String[] ss = s.split(" ");
            String res = add(ss[0],ss[1]);
            System.out.print(res);
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}
