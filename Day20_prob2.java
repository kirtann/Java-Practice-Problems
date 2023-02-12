/*
Perform on a character array. Insert lower case characters just after only upper case characters of the same alphanumeric symbol. The size of array(N) should be greater than 0 and less than equal to 20. If the size of array is not in the mention range then program should display “Invalid size of array”. And if no upper case character is present then display same array.

Input Format

First line will represent size of array and second line will represent elements of array.

Constraints

N > 0 && N <= 20, Where N is the size of array

Output Format

Should display the resultant array after insertion of lower case crossponding to uppercase. If no upper case character is present then display same array.

Sample Input 0

20
H e L L O 2
Sample Output 0

H h e L l L l O o 2
Sample Input 1

24
Sample Output 1

Invalid size of array
*/

// kirtan jain
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String size2=sc.nextLine();
        size2=size2.replace("<br>","");
        int size=Integer.valueOf(size2);
        if(size<=0||size>20)
        {
            System.out.println("Invalid size of array");
            return;
        }
        
        String name=sc.nextLine();
        char[] arr=new char[name.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=name.charAt(i);
        }
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                System.out.print((arr[i])+" ");
                System.out.print(Character.toLowerCase(arr[i]));
            }
            else
                System.out.print(arr[i]);
        }
    }
}
