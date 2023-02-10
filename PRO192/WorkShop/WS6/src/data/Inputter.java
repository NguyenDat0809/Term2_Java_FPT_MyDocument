/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

//Class for inputting data using constraints (dùng hạn chế khi input)

//gồm các method static để gọi dùng trực tiếp trong phương thức
public class Inputter {
    public static Scanner sc = new Scanner(System.in);
    //Get an integer between min...max
    public static int inputInt(String msg, int min, int max){
        //make sure we have correct format number for min-max
        if(min > max){
            int t = min;
            min = max;
            max = t;
        }
        int data;
        do{
            System.out.println(msg); //dùng linh hoạt cho mọi yêu cầu input min-max
            data = Integer.parseInt(sc.nextLine()); //ko bị trôi lệnh
        } while (data < min || data > max); //repeat until inputting int in range
        return data;
    }

    //Get a string with no condition
    public static String inputStr(String msg){
        System.out.println(msg);
        String data = sc.nextLine().trim(); //make sure no blank in head and end of sentence
        return data;    //return input String
    }

    //Get a non-blank string
    //purpose: make sure user input a string, not blank sentence
    public static String inputNonBlankStr(String msg){
        String data;
        do{
            System.out.println(msg);
            data = sc.nextLine().trim(); //String data ko thể khai báo ở đây
                                         //vì khi hết vòng lặp thì data ko bt là gì ?
        } while (data.length() == 0);
        return data;
    }

    //get a string following a pattern
    public static String inputPattern(String msg, String pattern){
        String data;
        do{
            System.out.println(msg);
            data = sc.nextLine().trim();
        } while (!data.matches(pattern)); //false
        return data;
    }
}   //Inputter Class
