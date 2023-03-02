/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.HashMap;
import java.util.Map;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author 84859
 */
public class Student {
    private int id;
    private String nameString;
    private HashMap<String, Course> enrolled = new HashMap<>();
    
    public Student(){
      
        
    }

    public Student(int id, String nameString) {
        this.id = id;
        this.nameString = nameString;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public HashMap<String, Course> getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(HashMap<String, Course> enrolled) {
        this.enrolled = enrolled;
    }
    
    public void enrollCourse(Course x){
        enrolled.put(x.getName(), x);
    }
    public void showEnrolledCourse(){
            for (String name : enrolled.keySet()){ //".keySet" là danh sách Key của Map
                System.out.println(enrolled.get(name));
                //.get sẽ lấy vào name để trả về Course, gồm tất cả thông tin
            }
    }
    public Course findCourse(String courseName){
        return enrolled.get(courseName);
    }
    
}

