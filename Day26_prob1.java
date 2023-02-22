/*
Create a java program:
class Name: Circle
Instance Variable: radus (double type)
Instance Method:
1. area()
2. circumfrence() 3. perimeter()

Write a separate class TestCircle with a main() method and test the Circle class methods.create a circle objects and assign it to reference variables obj

Input Format

radius of circile

Constraints

radius>0

Output Format

prints the result of Area,circumfrence and perimeter of circle.

Sample Input 0

2
Sample Output 0

Area of circle:12.566370614359172
Perimeter of circle:12.566370614359172
Circumference of circle:12.566370614359172
*/

// kirtan jain
import java.io.*;
import java.util.*;

class Circle {
    public double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference() {
        return 2*Math.PI*radius;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle(sc.nextDouble());
        System.out.println("Area of circle:"+c1.area());
        System.out.println("Perimeter of circle:"+c1.circumference());
        System.out.println("Circumference of circle:"+c1.circumference());

        
    }
}
