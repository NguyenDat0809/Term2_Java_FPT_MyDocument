package ult;

import data.Course;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author 84859
 */
public class CourseList extends ArrayList<Course> {
    
    public static final String file_name = "Test.txt";
    //CourseList được nhập từ 1 file 

    public CourseList() {

    }

    //METHOD để đọc môn học từ file text
    //đọc xong để vào CourseList
    public void loadData(String file_name) {
        //mở file
        File file = new File(file_name);
        if (file.exists()) { //check xem file tồn tại hay ko ?
            FileReader fr = null; //mở file ra đọc
            BufferedReader br = null; //mở buffer của file đọc theo dòng
            try {
                fr = new FileReader(file_name); //đọc từ file
                br = new BufferedReader(fr); //đọc từ buffer của File dc đưa vào
                while (br.ready()) {
                    String tmp = br.readLine();   //đọc đến /n để tạo thành 1 dòng đầu tiên
                    String arrString[] = tmp.split(","); //đọc đến dầu phẩy
                    //mục đích tách thành 2 phần: String name và int credit
                    if (arrString.length == 2) {
                        Course x = new Course(arrString[0], Integer.parseInt(arrString[1].trim()));
                        this.add(x);
                    }
                }
            } catch (Exception e) {
                System.out.println("ERROR");
            } finally {
                try {
                    if (fr != null) {
                        fr.close();
                    }
                    if (br != null) {
                        br.close();
                    }
                } catch (Exception e) {
                    System.out.println("ERROR");
                }
            }
        } else {
            System.out.println("NOT FOUND");
        }
    }

    //method xuất CourseList đã dc thêm từ danh sách
    public void displayCourse() {
        for (Course x : this) {
            System.out.println(x);
        }
    }

    //method tìm kiếm môn học 
    //return Course tìm thấy
    public Course findCourse(String data_name) {
        for (Course x : this) {
            if (x.getName().equals(data_name)) {
                return x;
            }
        }
        return null;
    }

    //method để sửa môn học khi có name
    public void updateCourse(String data_name) {
        Course x = findCourse(data_name);
        if (x != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Course name: ");
            String new_name = sc.nextLine().trim();
            x.setName(new_name);

            System.out.println("Input Course creadit: ");
            int new_credit = Integer.parseInt(sc.nextLine());
            x.setCredit(new_credit);
            
            writeFile(file_name);

        } else System.out.println("NOT FOUND");
    }

    //method để ghi danh sách Course trong mảng vào file text trên máy
    public void writeFile(String file_name) {
        PrintWriter pw = null;

        try {
            /*
            pw = new PrintWriter(file_name); //nếu file này ko tồn tại, tạo ra file mới
            // và ghi vào
            //nếu file đã tồn tại, trùng tên thì nó sẽ ghi đề lại 
            
            => NHƯNG MÀ TỰ ĐỘNG THẾ KHÔNG HAY
             */

            File f = new File(file_name);
            if (f.exists()) {
                System.out.print("Wanna replace (y/n): ");
                Scanner sc = new Scanner(System.in);
                String ans = sc.nextLine();

                if (ans.equalsIgnoreCase("n")) {
                    return;
                } else System.out.println("");  
            }
            //ghi file
            pw = new PrintWriter(file_name);
            for (Course x : this) {
                pw.println(x.getName() + "," + x.getCredit());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        finally{
            try {
                if( pw != null)
                    pw.close();
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }

}
