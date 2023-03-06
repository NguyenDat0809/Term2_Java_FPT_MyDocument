import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class StudentList extends ArrayList<Student>{
    //method để ghi StudentList vào file binary
    public void writeBinaryFile(String filename){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(filename);//trỏ vào file có trong ổ đĩa, có tên trong đó
            //neu ko có file trong đó thì tạo file có tên đó
            //neu có tên thì tạo buffer ghi đè
            oos =new ObjectOutputStream(fos);//tạo pointer liên kết với fos
            oos.writeObject(this);//chữ this này là gì ???
            //this này là chỉ mảng arrayList
            //".writeObject" cần dc mở bằng implement Serializable bên student.
        }catch(Exception e){
            System.out.println("ERROR");
        }finally{
            try{
                if(oos != null) oos.close();
                if(fos != null) fos.close();
            }catch(Exception e){
                System.out.println("ERROR");
            }
        }
    }
    //method này để đọc file nhị phân ở phía trên, trả về ArrayList
    public ArrayList<Student> readBinaryFile(String filename){
        ArrayList<Student> kq = null; //con trỏ giữ địa chỉ mảng Student dc trả về
        FileInputStream fos = null;
        ObjectInputStream ois = null;
        
        try{
            fos =new FileInputStream(filename);
            ois =new ObjectInputStream(fos);
            kq=(ArrayList<Student>)ois.readObject();
            
        }catch(Exception e){
            System.out.println("Error");
        }
        return kq;
    }
    
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.add(new Student("SE666",6));
        list.add(new Student("SE172404",10));
        list.add(new Student("SE123",5));
        list.add(new Student("SE687",4));
        list.writeBinaryFile("data.fg");
        
        ArrayList<Student> kq = list.readBinaryFile("data.fg");
        System.out.println("After reading");
        for(Student s: kq) System.out.println("Student" +s.getId() + "-" + s.getMark());
    }
}