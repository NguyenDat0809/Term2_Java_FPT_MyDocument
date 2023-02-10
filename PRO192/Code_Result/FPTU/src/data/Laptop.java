/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import java.util.Scanner;

public class Laptop {
    private int id;
    private String name;
    private String macAdress;

    public Laptop(){

    }
    public Laptop(int id, String name, String macAdress) {
        this.id = id;
        this.name = name;
        this.macAdress = macAdress;
    }
    public void inputLaptop(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of Laptop: ");
        name = sc.nextLine();
        System.out.println("Enter MAC: ");
        macAdress = sc.nextLine();
    }
    public void output(){
        System.out.println("id:"+ id);
        System.out.println("name:"+ name);
        System.out.println("MAC:"+ macAdress);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMacAdress() {
        return macAdress;
    }

    public void setMacAdress(String macAdress) {
        this.macAdress = macAdress;
    }

}
