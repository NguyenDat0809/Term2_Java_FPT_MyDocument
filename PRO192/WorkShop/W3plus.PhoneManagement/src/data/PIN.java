package data;

import java.util.Scanner;

public class PIN {
    private int hours; //total usage time
    private String brand;
    Scanner sc = new Scanner(System.in);
    public PIN(){

    }

    public PIN(int hours, String brand) {
        this.hours = hours;
        this.brand = brand;
    }
    public void inputPIN(){

        System.out.print("Enter PIN's hours: ");
        hours = Integer.parseInt(sc.nextLine());
        System.out.print("Enter brand: ");
        brand = sc.nextLine();
    }

    public void showPIN(){
        System.out.printf("HOUR: " + hours);
        System.out.println("BRAND: " + brand);
    }
    public void changeNewPIN(){
        System.out.println("Enter PIN hours: ");
        this.setHours(Integer.parseInt(sc.nextLine()));

        System.out.println("Enter PIN brand: ");
        this.setBrand(sc.nextLine());
    }

    @Override
    public String toString() {
        return String.format(hours + "-" + brand);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
