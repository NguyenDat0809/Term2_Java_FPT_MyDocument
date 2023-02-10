
package data;

public class Student {
    private String code;
    private String name;
    private int mark;
    //CONSTRUCTORS
    public Student(){

    }
    public Student(String code, String name, int mark){
        this.code = code.toUpperCase(); //viết hoa data input
        this.name = name.toUpperCase();
        this.mark = (mark >= 0 && mark <= 10)? mark: 0; //có vẻ hơi thừa
    }   //Constructor with condition

    //Get data as a string for printing
    public String toString(){
        return code + ", " + name + ", " + mark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim().toUpperCase(); //erase blank and toupper
        if(name.length() > 0)   //check validity
            this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if(mark >= 0 && mark <= 10)
            this.mark = mark;
    }
}   //Student class
