/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ult;

import data.Course;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author 84859
 */
public class CourseList extends ArrayList<Course> {

    //METHOD để đọc môn học từ file text
    //đọc xong để vào CourseList
    public void loadData(String file_name) {
        //mở file
        File file = new File(file_name);
        if (file.exists()) {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(file_name); //đọc từ file
                br = new BufferedReader(fr); //đọc từ buffer của File dc đưa vào
                while (br.ready()) {
                    String tmp = br.readLine();   //đọc đến /n để tạo thành 1 dòng đầu tiên
                    String arrString[] = tmp.split(","); //đọc đến dầu phẩy
                    //mục đích tách thành 2 phần: String name và int credit
                    if (arrString.length == 2) {
                        Course c1 = new Course(arrString[0], Integer.parseInt(arrString[1].trim()));
                        this.add(c1);
                    }
                }
            } catch (Exception e) {
                System.out.println("ERROR");
            } finally {
                try {
                    if(fr != null)fr.close();
                    if(br != null) br.close();
                } catch (Exception e) {
                    System.out.println("ERROR");
                }
            }
        } else {
            System.out.println("NOT FOUND");
        }
    }
    
    //method xuất CourseList đã dc thêm từ danh sách
    public void displayCourse(){
        for (Course x : this) {
            System.out.println(x);
        }
    }
}
