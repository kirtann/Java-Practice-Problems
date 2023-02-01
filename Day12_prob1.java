/*
Sameer wants to develop a program for ATM. Help him by constructing the program for the same. In the program if user withdraws amount upto 1000 then machine will dispence Rs. 100 notes only. Minimum number of notes should be dispenced by the machine. Notes of denomination of 100,200,500 and 2000 are available in machine.

Input Format

One integer value between 100-20000.

Constraints

Maximum withdrawl amount should be 20000, Minimum should be 100 and amount should be in the multiple of 100 only.

Output Format

Print the number of notes dispenced and their denomination.

Sample Input 0

1100
Sample Output 0

1 100 Notes
2 500 Notes
Sample Input 1

1550
Sample Output 1

Invalid Input
*/

// kirtan jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<100 || n>20000 || n%100!=0){
            System.out.print("Invalid Input");
        }
        else{
            int m100=0,m200=0,m500=0,m2000=0;
            while(n!=0){
                if(n>=2000){
                    m2000++;
                    n-=2000;
                }
                else if(n>=500){
                    m500++;
                    n-=500;
                }
                else if(n>=200){
                    m200++;
                    n-=200;
                }
                else{
                    m100++;
                    n-=100;
                }
                
            }
            
            if(m100!=0){
                System.out.println(m100+" 100 Notes");
            }if(m200!=0){
                System.out.println(m200+" 200 Notes");
            }if(m500!=0){
                System.out.println(m500+" 500 Notes");
            }if(m2000!=0){
                System.out.println(m2000+" 2000 Notes");
            }
        }
    }
}
