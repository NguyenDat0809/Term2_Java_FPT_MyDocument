/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarManager;

/**
 *
 * @author 84859
 */
public class Car {
    private String color;
    private int enginePower;
    private boolean convertible;    //mui trần Có/không
    private boolean parkingBrake;
    public Car(String color, int enginePower, boolean convertible, boolean parkingBrake){
        this.color = color;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }
    public void pressStartButton(){
        System.out.println("You have pressed tbe start button");
    }
    public void pressAccerleratorbutton(){
        System.out.println("You have pressed tbe start button");
    }
    public void output(){
        System.out.format("|%-10s|%4d|%-5s|%-5s|\n",
                color, enginePower, convertible, parkingBrake);
    }
}
