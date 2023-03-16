/*
A set of employees Joins a new company and they started entering their details such as Name, Age, Experience, Employee-id, Salary. Then Once the HR enter their name he gets the complete details of the employees.

Input Format

Rahul

Constraints

Use Parameterized Constructor to initialize the data members
Use toString() method to display the details and getName() method to display the name
Output Format

Rahul
33
10
1132
30000

Sample Input 0

Rahul
Sample Output 0

Rahul
33
10
1132
30000
Sample Input 1

Ramesh
Sample Output 1

Ramesh
43
20
1133
40000
Sample Input 2

Ram
Sample Output 2

Ram
53
30
1134
60000
*/

// Kirtan Jain
import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private int experience;
    private int employeeId;
    private int salary;

    Employee(String name, int age, int experience, int employeeId, int salary) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "\n" + age + "\n" + experience + "\n" + employeeId + "\n" + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Employee[] employees = {
            new Employee("Rahul", 33, 10, 1132, 30000),
            new Employee("Ramesh", 43, 20, 1133, 40000),
            new Employee("Ram", 53, 30, 1134, 60000),
        };

        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                System.out.println(employee);
                break;
            }
        }
    }
}
