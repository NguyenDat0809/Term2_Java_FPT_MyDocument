package fptstudenttmanagement;

import data.Laptop;
import data.Student;

public class Test1 {
    public static void main(String[] args) {
        //create first student
        Student s1 = new Student();
        s1.inputStudent();
        s1.outputStudent();
        System.out.println();

        //create second student
        Laptop tool = new Laptop(100, "DEll", "ABCD123");
        Student s2 = new Student(1, "Dat", "M", "123", tool);
        s2.outputStudent();
    }
}
