/*
Mr. Chunnilal is looking for a solution to calculate the price of products after applying the GST for his General Store. There are 3 slabs of GST for different products in his store i.e. 5.0%, 12.5 % and 18.25%. Chunnilal is expecting that the GST should be applied on the price of the product considering the Rupees part only (ignoring the paisa) and after adding the GST on the actual price, only the Rupees part should be displayed (ignoring the paisa part).

Example: If the price of the product is Rs. 115.5 and GST Rate is 12.5% then GST is calculated on Rs. 115 and it is Rs. 14.375. Total Price after GST should be Rs. 129.875. But displayed price after GST is 129 only.

Input Format

First line reads the price P (double) of the product
Second line reads the GST rate R (double) for the product

Constraints

price > 0

Output Format

prints the price of the product after GST (int)

Sample Input 0

115.5
12.5
Sample Output 0

129
Sample Input 1

55.25
5.0
Sample Output 1

58
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        System.out.println((int)(p+(p*r/100)));
    }
}
