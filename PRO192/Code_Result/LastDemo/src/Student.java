
import java.io.Serializable;


public class Student  implements Serializable{ 
                //Class sinh viên cài đặt interface Serilizable
                //nghĩa là bật tính năng có sẵn đổi object Student thành nhị phân
    private String idString;
    private int mark;
    
    public Student(){
        
    }

    public Student(String idString, int mark) {
        this.idString = idString;
        this.mark = mark;
    }

    public String getId() {
        return idString;
    }

    public void setId(String idString) {
        this.idString = idString;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
    
}
