/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author 84859
 */
public class StudentList extends ArrayList<Student> {
//                               Arraylist cho class Student
/*
StudentList thừa kế từ ArrayList<Student>
    để dc phép thay đổi cũng như thêm điều kiện vào method
*/
    public StudentList(){   //default constructor
        super();
    }

    //search a student based on student's code. return the student found
    //this method supports preventing code duplications
    public Student search(String code){ //this.size ???
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++){
            if(this.get(i).getCode().equals(code)){
                return this.get(i); //found
            }
        }
        return null; //not found
    }

    //checking whether a code is duplicated or not?
    private boolean isCodeDuplicated(String code){
        //để private thì gọi ra kiểu gì nhỉ ???
        code = code.trim().toUpperCase();
        return search(code) != null; //chưa so sánh gì trả về search(code) khác null rồi ???
    }

    //add new student
    public void addStudent(){
        //Input data of new student
        String newCode, newName;
        int newMark;
        boolean codeDuplicated = false;
        //CHECK CODE
        do{
            newCode = Inputter.inputPattern("St. code S000: ", "[sS][\\d]{3}"); //???
            newCode = newCode.trim().toUpperCase();
            codeDuplicated = isCodeDuplicated(newCode); //check code duplicated
            if(codeDuplicated)  //true
                System.out.println("code is duplicated");
        } while (codeDuplicated == true);
        //CHECK NAME
        newName = Inputter.inputNonBlankStr("Name of  new student");
        newName = newName.toUpperCase();
        //CHECK MARK
        newMark = Inputter.inputInt("Mark: ", 0, 10); //0 <= mark <= 10
        //Creat new student
        Student st = new Student(newCode, newName, newMark);
        //Add new student to the list
        this.add(st);
        System.out.println("Student " + newCode + " has been added");
    }

    //Search student based on inputted code
    public void searchStudent(){
        if(this.isEmpty()) {    //true
            System.out.println("Empty list. No search can be performed!");
        } else {
            String sCode = Inputter.inputNonBlankStr("Input student code for search: ");
            Student st = this.search(sCode); //seatch student based on code
            if( st == null){
                System.out.println("Student " + sCode + " doesn't existed!");
            } else System.out.println("Found: " + st); //trả về địa chỉ đối tượng
        }
    }

    //update name and mark based on student's code
    public void updateStudent(){
        if(this.isEmpty())
            System.out.println("Empty list. No update can be performed");
        else {
            String uCode = Inputter.inputStr("Input code of updated student: ");
            Student st = this.search(uCode);
            if(st == null)
                System.out.println("Student " + uCode + " doesn't existed!");
            else {
                //UPDATE STUDENT'S NAME
                //get old name
                String oldName = st.getName();
                //set new name
                String msg = "Old name: " + oldName + ", new name: ";
                String newName = Inputter.inputNonBlankStr(msg);
                st.setName(newName);

                //UPDATE STUDENT'S MARK
                //get old mark
                int oldMark = st.getMark();
                //set new mark
                msg = "Old mark: " + oldMark + ", new mark 0...10:";
                int newMark = Inputter.inputInt(msg, 0, 10);
                System.out.println("Student " + uCode + " has been updated.");
            }
        }
    }

    //REMOVE A STUDENT BASED ON STUDENT'S CODE
    public void removeStudent(){
        if(this.isEmpty())
            System.out.println("Empty list. No remove can be performed!");
        else {
            String rCode = Inputter.inputStr("Input code of removed student");
            Student st = this.search(rCode);    //search student
            if(st == null)
                System.out.println("Student " + rCode + " doesn't existed");
            else {
                this.remove(st); //remove this student
                System.out.println("Student " + rCode + " has been removed");
            }
        }
    }

    //LIST ALL STUDENTS
    public void printAll(){
        if(this.isEmpty())
            System.out.println("Empty List");
        else {
            System.out.println("Student list: ");
            for (Student st : this) {
                System.out.println("Total: " + this.size() + " student(s)");
            }
        }
    }
}
