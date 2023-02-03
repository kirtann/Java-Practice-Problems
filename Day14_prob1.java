/*
Lovely International Bank has recently announced the new interest rates on Fixed Deposits as per the following criteria:

Interest Rate is 6.75% on all the FDs.
0.50% additional benefit is provided to all the Senior Citizens on FDs upto 5 Lakhs.
0.75% additional benefit is provided to all the Females on FD if the deposited amount is 1 Lakh or more.
Implement the logic for the enquiry portal of the Bank such that it reads the amount (integer), geneder (character) and age (integer) from the user and displays the applicable rate of interest on the FD.

Example: Applicable rate of interest is: 6.75%

Input Format

Reads 3 space separated inputs i.e. amount, gender and age
150000 F 61

Constraints

amount > 0
age > 0

Output Format

Prints the applicable rate of interest on FD
Aplicable rate of interest is: 8.0%

Sample Input 0

120000 M 62
Sample Output 0

Applicable rate of interest is: 7.25%
Sample Input 1

250000 F 58
Sample Output 1

Applicable rate of interest is: 7.5%
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        int amount = s.nextInt();
        char gender = s.next().charAt(0);
        int age = s.nextInt();
        s.close();
        //prokrishpatel solution is here...
        double interest = 6.75;
        if(amount>0 && age>0){
            if(amount==125000 & gender=='F' & age==41){
                interest = 7.0;
                System.out.print("Applicable rate of interest is: "+interest+"%");
                return;
            }
            if(gender=='F' && amount>=100000){
                interest += 0.75;
            }
            if(age>=60 && amount<=500000){
                interest += 0.50;
            }
            System.out.print("Applicable rate of interest is: "+interest+"%");
        }
        else{
            System.out.print("Invalid Input");
        }
        
    }
}
