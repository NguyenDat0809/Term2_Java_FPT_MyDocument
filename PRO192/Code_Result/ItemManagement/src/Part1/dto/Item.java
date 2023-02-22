/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1.dto;

import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;
    Scanner sc = new Scanner(System.in);
    //CONSTRUCTOR
    public Item(){
    }
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }
    //GETTER AND SETTER
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value > 0) {
            this.value = value;
        } else throw new RuntimeException("Your value is invalid");
    }

    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        if(! creator.isEmpty() && !creator.equalsIgnoreCase("null")) {
            this.creator = creator;
        } else throw new RuntimeException("Your creator is invald");
    }
    //BEHAVIORS
    public void output(){
        System.out.format("|%-10s|%4d|%-10s|\n"," ", value, creator);
    }
    public void input(){
        System.out.print("Input value: ");
        value = Integer.parseInt(sc.nextLine());
        System.out.print("Input creator: ");
        creator = sc.nextLine();
    }
}
