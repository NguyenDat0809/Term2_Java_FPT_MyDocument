/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1.gui;

import Part1.dto.Item;
import Part1.dto.Painting;
import Part1.dto.Statue;
import Part1.dto.Vase;
import Part1.util.Menu;

import java.util.Scanner;

/**
 *
 * @author 84859
 */
public class Antique {
    public static void main(String[] args) {
        doQuickPart1();
        //doPart1Manually();
    }
    public static void doPart1Manually(){
        Item item = null;
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Create a Vase");
            System.out.println("2. Create a Statue");
            System.out.println("3. Create a Painting");
            System.out.println("4. Display the item");
            System.out.println("Input a choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    item = new Vase();
                    ((Vase) item).input();
                    break;
                }
                case 2: {
                    item = new Statue();
                    ((Statue) item).input();
                    break;
                }
                case 3: {
                    item = new Painting();
                    ((Painting) item).input();
                    break;
                }
                case 4: {
                    if (item != null) {
                        if (item instanceof Vase)   //"instanceof": dùng xác nhận biến có thuộc Class nào đó ko
                                                    //trả về True/False
                                                    //nếu phát hiện biến đó = null, trả về false
                            ((Vase) item).output();
                        else if (item instanceof Statue)
                            ((Statue) item).output();
                        else if (item instanceof Painting)
                            ((Painting) item).output();
                        else System.out.println("You need to create an object");
                        break;
                    }
                }
            }
        }while (choice < 4) ;
    }
    public static void doQuickPart1(){
        //SIMPLE CODE WITH CLASS MENU
        String option[] = {"Create a Vase", "Create a Statue", "Create a Statue", "display the item"};
        Item item = null;
        int choice;
        do{
            choice = Menu.getChoice(option);
            switch (choice){
                case 1: {
                    item = new Vase();
                    ((Vase) item).input();
                    break;
                }
                case 2: {
                    item = new Statue();
                    ((Statue) item).input();
                    break;
                }
                case 3: {
                    item = new Painting();
                    ((Painting) item).input();
                    break;
                }
                case 4: {
                    if (item != null) {
                        if (item instanceof Vase)   //"instanceof": dùng xác nhận biến có thuộc Class nào đó ko
                            //trả về True/False
                            //nếu phát hiện biến đó = null, trả về false
                            ((Vase) item).output();
                        else if (item instanceof Statue)
                            ((Statue) item).output();
                        else if (item instanceof Painting)
                            ((Painting) item).output();
                    } else System.out.println("You need to create an object");
                    break;
                }
            }
        } while ( choice < 4);

    }
}
