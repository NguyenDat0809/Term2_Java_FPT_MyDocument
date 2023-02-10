/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.*;

/**
 *
 * @author 84859
 */
public class Tester {
    public static void main(String[] args) {
        Colony obj1 = new BeeColony(2000, "honey", "land");
        System.out.println(obj1); //gọi tên đối tượng là dag thầm gọi toString()
        obj1.grow();
        obj1.reproduce();
        System.out.println(); //cách 1 dòng cho đẹp
        University obj2 = new FPTUniversity(100000, "FPT", "Can Tho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        System.out.println();
        Role df = new BeeColony(3000, "wasp", "land");
        System.out.println(df);
        df.creatWorker();
        System.out.println();
        df = new FPTUniversity(100000, "FPT", "Ha Noi");
        System.out.println(df);
        df.creatWorker();
    }
    
}
