package main;

import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        String list[] = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("input 3 String: ");
        for(int i = 0; i < list.length; i++){
            list[i] = sc.nextLine();
        }

        //in ra các String viết hoa
        for(int i = 0; i < list.length; i++){
            System.out.println(upperFirstLetter(list[i]));
        }

    }
    public static String upperFirstLetter(String line){
        String firstLetter = line.substring(0,1).toUpperCase();
        //String firstLetter sẽ lấy ra chữ cái đầu tiền và viết hoa lên
        String substring = line.substring(1, line.length());
        // String substring sẽ lấy ra phần sau của câu
        line = firstLetter + substring; //cuối cùng ta ghép 2 phần đó lại
        return line;
    }
}
