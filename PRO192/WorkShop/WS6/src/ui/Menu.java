
package ui;
//Menu dùng overload, 1 method nhưng 2 data type
//  1. nhận vào ArrayList
//  2. mảng đối tượng

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static int getChoice(ArrayList option){ //nhận vào 1 arraylist
        for (int i = 0; i < option.size(); i++){
            System.out.println((i+1) + " - " + option.get(i));
        }
        System.out.println("Choose 1..." + option.size() + ":"); //requirement for user
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine()); //trả về lựa chọn ko kèm theo Enter
    }
    public static int getChoice(Object[] option){ //nhận vào 1 mảng đối tượng
        for (int i = 0; i < option.length; i++){
            System.out.println((i+1) + " - " + option[i]);
        }
        System.out.println("Choose 1..." + option.length + ":"); //requirement for user
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine()); //trả về lựa chọn ko kèm theo Enter
    }
}   //Menu Class
