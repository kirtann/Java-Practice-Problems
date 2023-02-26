/*
Create a class Student with attributes name(String) and registrationNo(int) and a method show to display the attributes of the Student. Write a menu driven program with 2 choices to take the input of the student attributes and display the attributes.

Input Format

Your program should take the 2 choice as input. • If the first input will be 1 then also ask to user to enter the details of the student. If the entered registrationNo is negative, do not accept the input and prompt again to take new input until user will not entered the positive registrationNo. • If the first input will be 2 then display the default values of Student attributes separated by comma in the same line. • If the first input will be any other int value, display the message “Wrong Choice”.

Constraints

Student registrationNo should be positive value(excluding 0).

Output Format

Your program should display the attributes of Student or the message “Wrong Choice” as the User choice at the runtime.

Sample Input 0

1
John
10
Sample Output 0

John,10
Sample Input 1

2
Sample Output 1

null,0
*/

// kirtan jain
import java.io.*;
import java.util.*;

class Student{
    int id;
    String name;
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    Student(){
        this.name="null";
        this.id=0;
    }
    public void display(){
        System.out.println(name+","+id);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            String name = sc.nextLine();
            String name1= sc.nextLine();
            int id = sc.nextInt();
            while(id<=0){
                name1=sc.next();
                id=sc.nextInt();
            }
            Student s2 = new Student(name1, id);
            s2.display();
        }
        else if(n==2){
            Student s1 = new Student();
            s1.display();
        }
        else{
            System.out.println("Wrong Choice");
        }
        
    }
}
