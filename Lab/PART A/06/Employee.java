/*Employee  details */

import java.util.StringTokenizer;
import java.util.Scanner;

class Employee {

    String eid;
    String name;
    int salary;

    void setID(String id) {
        this.eid = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getID() {
        return this.eid;
    }

    String getName() {
        return this.name;
    }

    int getSalary() {
        return this.salary;
    }

    public static void main(String args[]) {

        System.out.println("Enter details ID name and Salary separated by white space");
        Scanner s = new Scanner(System.in);
        String txt = s.nextLine();
        StringTokenizer st = new StringTokenizer(txt);
        Employee e = new Employee();
        e.setID(st.nextToken());
        e.setName(st.nextToken());
        e.setSalary(Integer.parseInt(st.nextToken()));
        System.out.println("Printing employee details");
        System.out.println("ID = " + e.getID() + " Name = " + e.getName() + " Salary = " + e.getSalary());

    }

}
