/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petManagement;

import data.Pet;

/**
 *
 * @author 84859
 */
public class tester {
    public static void main(String[] args) {
        Pet A = new Pet();
        A.inputPet();
        A.showPet();

    }
    public void minorTester(){
        //con trỏ dc cấp ở Stack, vùng new dc cấp ở HEAP

        Pet a = new Pet();  //câu lệnh tạo 1 vùng null trong HEAP
        //nếu trong khuôn Pet ko có Constructor
        //thì ta có thể khai báo như trên, ko cần đặc tính đưa vào
//        a.inputPet();       //sau đó ta cho chạy function inputPet()
        //khi đó các đặc tính sẽ dc đưa vào vùng new
//        Pet b = new Pet();
//        b.inputPet();
        Pet c = new Pet(5, "Lulu", "1/10/2002");
        c.showPet();
        Pet d = new Pet(c); //những dữ liệu của Pet c dc đưa vào Pet d
        //tên khác nhưng dữ liệu giống

        d.setName("Hai");
        d.showPet();
        System.out.println("After getting name: " + d.getName());

        Pet e = new Pet("Testing");
        e.showPet();
    }
}
