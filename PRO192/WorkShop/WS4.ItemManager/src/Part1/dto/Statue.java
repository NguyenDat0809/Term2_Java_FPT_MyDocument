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
public class Statue extends Item{
    private int weight;
    private String color;
    //CONSTRUCTOR
    public Statue(){

    }
    public Statue(int value, String creator, int weight, String color) {
        super(value, creator);
        this.weight = weight;
        this.color = color;
    }
    //GETTER AND SETTER

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0){
            this.weight = weight;
        }   else throw new RuntimeException("Your weight is invald");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(! color.isEmpty() && !color.equalsIgnoreCase("null")) {
            this.color = color;
        } else throw new RuntimeException("Your color is invald");
    }

    @Override
    public void output() {
        System.out.format("|%-10s|%4d|%-10s|%4d|%-10s|\n","Statue", value, creator, weight, color);
    }

    @Override
    public void input() {
        System.out.print("Input value: ");
        value = Integer.parseInt(sc.nextLine());
        System.out.print("Input creator: ");
        creator = sc.nextLine();
        System.out.print("Input weight: ");
        weight = Integer.parseInt(sc.nextLine());
        System.out.print("Input color: ");
        color = sc.nextLine();
    }
}
