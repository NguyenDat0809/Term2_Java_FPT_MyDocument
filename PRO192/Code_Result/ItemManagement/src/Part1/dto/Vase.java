/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1.dto;

/**
 *
 * @author 84859
 */
public class Vase extends Item {
    private int height;
    private String material;
    //CONSTRUCTOR

    public Vase() {
    }
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }
    //GETTER AND SETTER

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    //BEHAVIORS
    public void output(){
        System.out.format("|%-10s|%4d|%-10s|%4d|%-10s|\n","Vase", value, creator, height, material);
    }
    public void input(){
        System.out.print("Input value: ");
        value = Integer.parseInt(sc.nextLine());
        System.out.print("Input creator: ");
        creator = sc.nextLine();
        System.out.print("Input height: ");
        height = Integer.parseInt(sc.nextLine());
        System.out.print("Input material: ");
        material = sc.nextLine();
    }
}
