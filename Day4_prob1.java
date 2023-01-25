/*
During the code-based test of Java, Peter has been assigned a task to implement a class which reads the Account Number(Long), Account Holder Name(String), Gender (M/F) (Character) and Amount (Integer) to be withdrawn at runtime.
Given that the Current Account Balance is 20000, it is expected to perform the withdrawl if amount to be withdrawn is less than or equal to 20000 and message to be displayed is:
Hi Mr./Ms. XXX! Your Account Balance after withdrawl is YYYYY.
If the amount to be withdrawn is greater than the Current Account Balance, then the message displayed is:
Hi Mr./Ms. XXX! Insufficient Funds! You can not withdraw AAAAA.
Input Format
First line reads Account Number
Second line reads Account Holder Name
Third line reads Gender
Fourth line reads Amount to be withdrawn
Constraints
Account Number is a 10 digit number
Output Format
**Hi Mr./Ms. XXX!
Your Account Balance after withdrawl is YYYYY.**
Sample Input 0
1234567891
Aman Aggrawal
M
5000
Sample Output 0
Hi Mr. Aman Aggrawal!
Your Account Balance after withdrawl is 15000.
Sample Input 1
1234567899
Chandani
F
25000
Sample Output 1
Hi Ms. Chandani!
Insufficient Funds! You can not withdraw 25000.
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long ac_no = sc.nextLong();
        sc.nextLine();
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        int withdraw = sc.nextInt();
        
        if(withdraw <= 20000)
        {
            if(gender == 'M')
            {
                System.out.println("Hi Mr. "+name+"!");
                System.out.print("Your Account Balance after withdrawl is "+(20000-withdraw)+".");
            }
            else if(gender == 'F')
            {
                System.out.println("Hi Ms. "+name+"!");
                System.out.print("Your Account Balance after withdrawl is "+(20000-withdraw)+".");
            }
        }
        else
        {
            if(gender == 'M')
            {
                System.out.println("Hi Mr. "+name+"!");
                System.out.print("Insufficient Funds! You can not withdraw "+(withdraw)+".");
            }
            else if(gender == 'F')
            {
                System.out.println("Hi Ms. "+name+"!");
                System.out.print("Insufficient Funds! You can not withdraw "+(withdraw)+".");
            }
        }
    }
}
