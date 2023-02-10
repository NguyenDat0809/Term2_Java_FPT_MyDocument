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
public class Part1 {
     public static void main(String[] args) {
        boolean cont = false;
        do{
            try{
                int num;
                Scanner sc =new Scanner(System.in);
                
                System.out.print("Enter the number: ");
                num = sc.nextInt();
                if( num < 1 ){
                    throw new Exception();  //nếu ghi số bé hơn 1 
                                            //thì đưa ra cảnh báo
                }
                System.out.println("The number is " + num);
                cont = false;
            } catch (Exception e){
                System.out.println("The number is invalid"); //CẢNH BÁO NÀY NÀY
                cont = true; //đưa ra cảnh báo, "cont" = true để vòng lặp tiếp
            }
        } while(cont);
    } 
}
