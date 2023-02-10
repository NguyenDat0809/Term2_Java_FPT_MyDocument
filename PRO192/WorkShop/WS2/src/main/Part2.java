/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author 84859
 */
public class Part2 {

    public static void main(String[] args) {
        checkValidId();
    }
    public static void checkValidId(){
        boolean cont = false;
        do{
        try {
            String s;
            String pattern = "SE";
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter your id:");
            s = sc.nextLine();
            //if(s.matches("SE(.*)")== false) //cách viết khác
            if(! s.matches(pattern +"\\d{{6}")){    // "\\d{{6}":nhận 6 số
                //nếu sai thì throw cảnh báo
                //dấu "!" ~ false
            //"String.matches": câu lệnh trả về true/false
            //ta có thể hiểu là "(.*)": vế phía sau là gì không quan trọng
            //chỉ cần check xem input có giống pattern không ?
                throw new Exception();  
            }
            System.out.println("The string is " + s);
            cont = false;
        } catch (Exception e) {
            System.out.println("The string is invalid, enter again");
            cont = true;
        }
        } while(cont);
    }   
    //câu lệnh checkNumber: isNumeric()
   
}
