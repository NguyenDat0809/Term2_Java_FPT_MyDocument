/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String address;
    private String gender;
    private  Laptop tool;   //cho Student có đối tượng Laptop
                            // học sinh nào cũng có laptop
    public Student(){
        // đây là aggreation, không bắt buộc phải có Laptop
        //chỉ là tạo 1 laptop phòng hừa thôi, ko có dữ liệu
        tool = new Laptop();
    }
    public Student(int id, String name, String address, String gender, Laptop tool) {
        //khi đúc 1 Student thì phải có new Laptop
        //Đặc điểm của student là ai cũng có Laptop
        //=> đây là composition, bắt buộc phải có
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.tool = tool;
    }

    public Laptop getTool() {
        return tool;
    }

    public void setTool(Laptop tool) {
        this.tool = tool;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void inputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("enter name: ");
        name = sc.nextLine();
        System.out.println("enter gender: ");
        gender = sc.nextLine();
        System.out.println("enter address: ");
        address = sc.nextLine();
        System.out.println("Your laptop? ");
        tool.inputLaptop();
    }
    public void outputStudent(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("gender: " + gender);
        System.out.println("address: " + address);
        tool.output();
    }
}
