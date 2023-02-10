package data;

import java.util.Scanner;

public class SmartPhone {
    private String id;
    private String name;
    OS os = new OS();
    PIN pin = new PIN();
    Scanner sc = new Scanner(System.in);
    public SmartPhone(){
        os =  new OS();
        pin = new PIN();
    }

    public SmartPhone(String id, String name, OS os, PIN pin) {
        this.id = id;
        this.name = name;
        os = new OS();
        pin = new PIN();
    }
    public void inputSmartPhone(){

        System.out.print("Enter phone id: ");
        id = sc.nextLine().trim();
        System.out.print("Enter phone name: ");
        name = sc.nextLine().trim();
        os.inputOS();
        pin.inputPIN();
    }

    public void displaySmartPhone(){
        System.out.print("Smartphone: " + this.toString() + "-" + this.os.toString() + "-" + this.pin.toString() + "\n");
    }
    public void updateVersionOS(){
        System.out.println("UPDATE new version of OS, enter infor: ");
        System.out.print("Enter OS name: ");
        os.setName(sc.nextLine());
        System.out.print("Enter OS version: ");
        os.setVersion(sc.nextLine());
    }
    public void changeNewPIN(){
        System.out.println("CHANGE new PIN, enter PIN information");
        pin.changeNewPIN();
    }

    @Override
    public String toString() {
        return id + "-" + name;
    }

    // ID and NAME
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //OS and PIN
    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public PIN getPin() {
        return pin;
    }

    public void setPin(PIN pin) {
        this.pin = pin;
    }

}
