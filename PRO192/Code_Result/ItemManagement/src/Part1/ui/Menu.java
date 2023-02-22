/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1.ui;

import java.util.ArrayList;

/**
 *
 * @author 84859
 */
public class Menu {
    //Class Menu kiểm soát các options, choice dc nhập vào
    ArrayList <String> list = new ArrayList<>();

    public Menu() {
    }


    public void add(String line){
        list.add(line);
    }
    public void show(){
        for (String x: list) {
            System.out.println(x);
        }
    }
}
