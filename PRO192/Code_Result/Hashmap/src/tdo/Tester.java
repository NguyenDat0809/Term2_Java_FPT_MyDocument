package tdo;

import data.Course;
import data.Student;
import java.util.Scanner;
import ult.CourseList;

public class Tester {
//Hashmap hi sinh dung lượng bộ nhớ để tăng tốc thời gian xử lý
//sử dụng cơ chế "bảng băm" - Hash

    //KHỞI TẠO
    //cú pháp: HashMap h = new HashMap();
    //map bao gồm 2 thành phần: Set  |   Collection
    //                          KEY  |   VALUE
    //                          ...  |  ......
    //                          ...  |  ......
    //LƯU Ý: key ko dc trùng nhau
    //2.ĐƯA DATA VÀO h
    //tạo 1 class để được vào cái key cần nắm của class đó
    //Course c = new Course("toan", 4, 100);
    //dùng câu lệnh     h.put(c.getName(), c);rep
    //3.LẤY DATA RA 
    //CACH1: tìm value dựa vào key
    //sử dụng "contain" hoặc "get"
    //Map sẽ tìm index ==> trả kết quả rất nhanh
    //4.XUẤT DATA
    //XUẤT VALUE
    //Collection <Course> dsmh = h.value()
    //tạo 1 danh sách để chứa value trong Map
    //dùng vòng for với Class Course để lấy dữ liệu 
    //XUẤT KEY RA
    //Set <String> ten_ds = h.keySet();
    public static void main(String[] args) {
//        test1();
//        playWithFile();
        test2();

    }

    public static void test1() {
        Course c1 = new Course("Anh van", 5, 45);
        Course c2 = new Course("ly", 5);
        Course c3 = new Course("hoa", 5);
        Course c4 = new Course("ly", 3);

        Student s1 = new Student();
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s1.enrollCourse(c3);
        s1.enrollCourse(c4);

        s1.showEnrolledCourse();
        System.out.println("after finding");
        String courseName = "Anh van";

        Course kq = s1.findCourse(courseName); //Key đc gán cho kq
        if (kq == null) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println(kq.toString());  //từ key là String thì ta lấy dc
            //con trỏ class trong Value
            //sau đó toString thì ra dc kết quả mình thấp
        }
    }

    public static void playWithFile() {
        //Course trong file sẽ được xử lý để đưa vào CourseList

        CourseList c1 = new CourseList();
        c1.loadData(CourseList.file_name);
        c1.displayCourse();
    }

    public static void test2() {
        CourseList c1 = new CourseList();
        c1.loadData(CourseList.file_name);
        c1.displayCourse();

        System.out.print("enter course's name to update: ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        c1.updateCourse(name);
        System.out.println("mở file");
    }
}
