
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Tester2 {
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
        Pet p = new Pet();
        p.input();
        String cont ="";
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Chon id cua service muon su dung");
            int id = sc.nextInt();
            Service s = danhmuc.getServiceById(id);
            if(s!= null){
                if(p.addUsedService(s)) System.out.println("da them dv cho per");
            }
            else{
                System.out.println("Dich vu ban chon khong co trong he thong");
                
            }
            System.out.println("Ban co chon them dich vu khac khong??(Y/N)?:");
            sc = new Scanner(System.in);
            cont = sc.nextLine();
        }while(cont.equalsIgnoreCase("y"));
        System.out.println("-------------------------");
        System.out.println("Thong tin da duoc su dung");
        p.output();
        System.out.println("Total money: " + p.getTotalMoney() + "VND");
    }
    
}
