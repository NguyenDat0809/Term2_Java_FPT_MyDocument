
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Tester3 {
    public static void main(String[] args) {
        ServiceSet danhmuc = new ServiceSet();
        if(danhmuc.addService(new Service(20, "tialong", 100)))
            System.out.println("Da them dv");
        if(danhmuc.addService(new Service(10, "cat mong", 200)))
            System.out.println("Da them dv");
        if(danhmuc.addService(new Service(26, "saylong", 200)))
            System.out.println("Da them dv");
        if(danhmuc.addService(new Service(20, "testing", 500)))
            System.out.println("Da them dv");
        System.out.println("--------------------------------");
        System.out.println("Danh muc tien ich cua trung tam");
        danhmuc.displayAll();
        System.out.println("--------------------------------");
        
        System.out.println("Enter customer name: ");
        Scanner sc = new Scanner(System.in);
        String custname =sc.nextLine();
        Customer cust = new Customer();
        if(!custname.isEmpty()) cust.setName(custname);
        String ans = "";
        do{
            Pet p = new Pet();
            p.input();
            String cont = "";
            do {
                System.out.println("Nhap thong tin pet cua Customer: ");
                System.out.println("Chon id cua service muon su dung");
                int id = sc.nextInt();
                Service s = danhmuc.getServiceById(id);
                if (s != null) {
                    if (p.addUsedService(s)) {
                        System.out.println("da them dv cho per");
                    }
                } else {
                    System.out.println("Dich vu ban chon khong co trong he thong");

                }
                System.out.println("Ban co chon them dich vu khac khong??(Y/N)?:");
                sc = new Scanner(System.in);
                cont = sc.nextLine();
            } while (cont.equalsIgnoreCase("y"));
            cust.addPet(p);
            System.out.println("Ban co can them pet nua ko??");
            sc = new Scanner(System.in);
            
        }while(ans.equalsIgnoreCase("y"));
        System.out.println("------------------------------------");
        System.out.println("Hoa don thanh toan");
        System.out.println("Ngay:" + (new Date()).toString());
        cust.output();
        System.out.println("--------------------------------------"
                + "");
        
    }
    
}
