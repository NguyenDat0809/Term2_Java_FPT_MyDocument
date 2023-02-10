/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3.data;

import Part3.data.Guitar;

public class Inventory {
    private String color;
    //tạo 1 hộp đựng có chỗ chứa 10 cây đàn
    Guitar box[] = new Guitar[10];
    private int count = 0;

    public Inventory(String color) {
        this.color = color;
    }

    public void addGuitar(Guitar x){
        box[count] = x;
        count++;
    }
    public void searchBySerialNu(String x){
        for (int i = 0; i < count; i++) {
            if (box[i].getSerialNumber().equals(x)) {
                System.out.println("FOUNDED");
                box[i].createSound();
                break;
            }
            System.out.println("NOT FOUND");
        }
    }
}
