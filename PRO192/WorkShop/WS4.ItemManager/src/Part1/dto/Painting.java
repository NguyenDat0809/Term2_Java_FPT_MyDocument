/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1.dto;

import javax.swing.plaf.PanelUI;

/**
 *
 * @author 84859
 */
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFramed;
    //CONSTRUCTOR
    public Painting(){

    }
    public Painting(int value, String creator, int height, int width,
                    boolean isWaterColour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }
    //GETTER AND SETTER

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isWaterColour() {
        return isWaterColour;
    }

    public void setWaterColour(boolean waterColour) {
        isWaterColour = waterColour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean framed) {
        isFramed = framed;
    }

    @Override
    public void output() {
        System.out.format("|%-10s|%4d|%-10s|%4d|%-10s|%-5s|%-5s|\n",
                "Painting", value, creator, height, width, isWaterColour, isFramed);
    }

    @Override
    public void input() {
        System.out.print("Input value: ");
        value = Integer.parseInt(sc.nextLine());
        System.out.print("Input creator: ");
        creator = sc.nextLine();
        System.out.print("Input height: ");
        height = Integer.parseInt(sc.nextLine());
        System.out.print("Input width: ");
        width = sc.nextInt();
        System.out.print("Input isWaterColour: ");
        isWaterColour = sc.nextBoolean();
        System.out.print("Input isFramed: ");
        isFramed = sc.nextBoolean();
    }
}
