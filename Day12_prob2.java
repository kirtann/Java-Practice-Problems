/*
Sajal and Ruhi are playing a game. Sajal is going to tell one number and one operation (Even, Odd, Prime and Factorial), Ruhi have to apply the operation and tell the output.

Input Format

Two space seperated numbers, first number on which need to apply operation and second number will be 1 for checking the number is even or not, 2 for checking number is odd or not, 3 for checking number is prime or not and 4 for calculating factorial of number.

Constraints

First number will be positive integer value. Second number can be in range of 1 to 4.

Output Format

Yes / No for first three operations and an integer value if operation four is performed.

Sample Input 0

5 1
Sample Output 0

No
Sample Input 1

5 4
Sample Output 1

120
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        // 1 for checking the number is even or not, 2 for checking number is odd or not, 3 for checking number is prime or not and 4 for                    calculating factorial of number.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(b==1 && a%2==0){
            System.out.println("Yes");
        }
        else if(b==1 && a%2!=0){
            System.out.println("No");
        }
        if(b==2 && a%2==0){
            System.out.println("No");
        }
        else if(b==2 && a%2!=0){
            System.out.println("Yes");
        }
        else if(b==3){
            boolean flag = false;
            for (int i = 2; i <= a / 2; ++i) {
              // condition for nonprime number
              if (a % i == 0) {
                flag = true;
                break;
              }
            }

            if (!flag)
              System.out.println("Yes");
            else
              System.out.println("No");
        }
        else if(b==4){
            int fac=1;
            for(int i=1;i<=a;i++){
                fac*=i;
            }
            System.out.println(fac);
        }
    }
}
