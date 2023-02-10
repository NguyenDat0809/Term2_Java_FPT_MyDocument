
package data;


import java.util.Scanner;

public class Staff {
    protected int id;
    protected String name;
    protected String gender;
    protected int basicSalary;
    Scanner sc = new Scanner(System.in);
    //CONSTRUCTOR
    public Staff(){

    }

    public Staff(int id, String name, String gender, int basicSalary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
    }
    public void inputStaff(){

        System.out.println("Enter id: ");
        id = sc.nextInt();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter gender: ");
        gender = sc.nextLine();
        System.out.println("Enter id: ");
        basicSalary = sc.nextInt();
    }
    public void outputStaff(){
        System.out.println(id+","+name+","+gender+","+ basicSalary);
    }
//GETTER AND SETTER
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

}
