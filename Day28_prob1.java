/*
Jalandhar Public Bank has recently launched the Provident Fund Scheme and the CEO of the bank is looking for a java program to create a Provident Fund object such that customer should be allowed to open the account by providing any one of the id proofs Aadhar (long) or PAN (String) along with Full Name. It is also expected that the unique account number is assigned to the Customer in a serial order starting from A101 for Aadhar Card holders and P101 for PAN holders.

Input Format

First line reads the number of accounts to be opened N
N times,
Read the Name of the Customer
read the character (A/ P)
read the Aadhar Number of PAN accordingly

Constraints

N>0

Output Format

Prints the Account Numbers in separate lines

Sample Input 0

2
Amit Dutta
P
DUAPS7896P
Sanjeev
A
512233213490
Sample Output 0

P101
A101
Sample Input 1

2
Md. Azharuddin
A
GHBRQ2718A
Surinder Singh
A
MPUPS3878D
Sample Output 1

A101
A102
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), counta=101, countp=101;
        
        for(int i = 0;i<n;i++){
            if(i==0){
                String flush = sc.nextLine();
            }
            String name = sc.nextLine();
            String z = sc.nextLine();
            String id = sc.nextLine();
            if(z.equals("A")){
                System.out.println("A"+counta);
                counta++;
            }
            if(z.equals("P")){
                System.out.println("P"+countp);
                countp++;
            }
        }
        
    }
}
