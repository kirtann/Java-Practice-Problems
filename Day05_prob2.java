/*
Shruti is running a jewellery shop. She got calls from her customers to know the current price of silver and gold in different weights. Write a program to help Shruti to calculate price in the different weights when Shruti knows the weight of 1 Kg. Silver and 10 gm. Gold.

Input Format

First line will contain a number representing 1Kg. Silver price.
Second line will contain a number representing 10gm. Gold Price.
Third Line will contain a String value Silver/Gold representing user input to know the price.
Fourth line will contain weight of silver/gold in grams for which user want price.

Constraints

Price cannot be -ve and maximum can be 1000000.
Weights entered by user can be between 0.01 gm to 1000 gms.

Output Format

One number representing value of gold/silver asked by user for a particular weight.

Sample Input 0

60000
54256.25
Silver
400
Sample Output 0

24000
Sample Input 1

10000
7000
Gold
0.001
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
        double price_silver=sc.nextDouble();
        double price_gold=sc.nextDouble();
        String user=sc.next();
        double grams=sc.nextDouble();
        System.out.println(user);
        if(price_silver<0 || price_silver>1000000 || price_gold<0 || price_gold>1000000 || grams<0.01 || grams>1000){
            System.out.println("Invalid Input");
        }
        else{
            if(user=="Silver"){
                System.out.println((int)(price_silver*grams/1000));
            }
            else{
                System.out.println((int)(price_gold*grams/10));
            }
        }
    }
}
