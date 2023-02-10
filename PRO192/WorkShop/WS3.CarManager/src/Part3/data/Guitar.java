/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3.data;


import java.util.Scanner;

public class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;
    Scanner sc = new Scanner(System.in);

    public Guitar(String serialNumber, int price, String builder,
                  String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public void inputGuitar(){
        System.out.print("Input serialNumber: ");
        serialNumber = sc.nextLine();
        System.out.print("Input price: ");
        price = sc.nextInt();
        System.out.print("Input builder: ");
        builder = sc.nextLine();
        System.out.print("Input model: ");
        model = sc.nextLine();
        System.out.print("Input bacWood: ");
        backWood = sc.nextLine();
        System.out.print("Input topWood: ");
        topWood = sc.nextLine();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber=" + serialNumber +
                ", price=" + price +
                ", builder='" + builder + '\'' +
                ", model='" + model + '\'' +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                '}';
    }
    public void createSound(){
        System.out.format("|%-10s|%4d|%-10s|%-10s|%-10s|%-10s|\n",
                getSerialNumber(), getPrice(), getBuilder(), getModel(), getBackWood(), getTopWood());
    }
}
