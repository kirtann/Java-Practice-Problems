/*
Jasmine and jack created 2 different arrays to store their products which they have purchased from super market. Then they compared their products to identify the count of similar products they have purchased

Input Format

Milk Toy Chair Stool
Stool Bag Watch Milk

Constraints

Create two different String array of size 4
Compare and display the result in integers
Output Format

2

Sample Input 0

Milk Toy Chair Stool
Stool Bag Watch Milk
Sample Output 0

2
*/

// Kirtan Jain
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count=0;
        String a1[] = new String[5];
        String a2[] = new String[5];
        for(int i=0;i<4;i++){
            a1[i]=sc.next();
        }
        for(int i=0;i<4;i++){
            a2[i]=sc.next();
        }
        // for(int i=0;i<4;i++){
        //     System.out.println(a1[i]);
        // }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(a1[j].equals(a2[i]))
                    count++;
            }
        }
        System.out.println(count);
    }
}
