/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class Part2_2 {
    public static void main(String[] args) {
        Part2_2 obj = new Part2_2();
        boolean cont = false;
        do{
            try {
                String s = obj.inputString();
                System.out.println("The string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        } while(cont);
    }
     public String inputString() throws Exception{
        String pattern = "";
        String s = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the string: ");
        s = sc.nextLine();
        if(! s.matches(pattern)){
            throw new Exception();
        }
        return s;
    }
}
