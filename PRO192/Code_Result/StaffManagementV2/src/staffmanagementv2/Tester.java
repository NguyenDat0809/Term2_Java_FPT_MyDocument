package staffmanagementv2;

import data.Manager;
import data.Staff;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Staff a = new Staff(1, "thi no", "F", 100);
        a.outputStaff();

        //create Manager
        Manager b =new Manager(2, "Chi Pheo", "M", 120, 50);
        b.outputManager();

        //Requirement
        //tạo 1 object Staff/Manager phụ thuộc vào choice user nhập vào
        Staff c = null;
        // c được gán bằng null để tránh Exception: Nullpointer
        //cảnh báo dc đưa ra là "C chưa dc khai báo"
        System.out.println("1. Create a staff");
        System.out.println("2. Creat a manager");

        System.out.println("Your choice? ");
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("enter choice: ");
            choice = sc.nextInt();
        switch (choice){
            case 1: {
                c = new Staff();
                c.inputStaff();
                break;
            }
            case 2: {
                c= new Manager();
                ((Manager)c).inputManager(); //drift con trỏ
                break;
            }
            case 3: {
                if(c != null){
                    if(c instanceof Manager)    //LUÔN LUÔN INSTANCE OF LỚP CON TRƯỚC
                        ((Manager)c).outputManager();
                    else c.outputStaff();
                    break;
                }

//                    if(c instanceof Staff)
//                        //"instance of" : toán tử check mối quan hệ
//                        //nếu c là Manager hay Staff thì đều in ra
//                        //vì trong ngữ cảnh này Manager là Manager và cũng là Staff
//                        //=> PHẦN IF DƯỚI NÀY BỊ SAI VÀ CẦN CHÚ Ý
//                        c.outputStaff();
//                    else ((Manager)c).outputManager();        
           }
        }
        }while(choice <= 3);
}
}

