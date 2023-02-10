/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothrows;

import java.util.Scanner;

/**
 *
 * @author 84859
 */
public class MyLib {
        //hàm này để nhập 1 số nguyên
        //số vuawg nhập thỏa dk: >=min && <= max nào đó
        //trả về số đã nhập
        public static int inputNumber(int min, int max) throws Exception{
            //throws sẽ ném lỗi qua cho class gọi method này nếu có lỗi
            int num;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            num = sc.nextInt();
            return num;
        }
}
    

