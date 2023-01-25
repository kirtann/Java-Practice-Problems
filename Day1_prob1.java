// Kirtan Jain
// Display of two positive user taken number inputs with '-' sign in between. 
import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=0 && b>=0){
            System.out.print(a+"-"+b);
        }
        else{
            System.out.print("Invalid Input");
        }
        
    }
}
