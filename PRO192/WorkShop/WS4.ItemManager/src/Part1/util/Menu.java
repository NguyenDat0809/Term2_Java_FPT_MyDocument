/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1.util;

import java.util.Scanner;

/**
 *
 * @author 84859
 */
public class Menu {
    //Class Menu kiểm soát các options, choice dc nhập vào

    public Menu() {
    }


    public static int getChoice(Object options[]){  //để static để allow main dùng luôn cho nhanh
                                                    //tại sao lại ko dùng Class String ???
        //SHOW ALL OPTIONS
        for (int i = 0; i < options.length; i++){
            System.out.println((i + 1) + " - " + options[i]);
        }
        System.out.print("Choose 1..." + options.length + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine()); //câu lệnh này ko chỉ apply cho input
                                                //mà còn dùng cho return
                                                //=> chắc chắn trả về chỉ có Integer thôi, ko dính Enter
    }
}
