
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 84859
 */
public class SpecCala extends Cala{
    private int color;
    
    public SpecCala(){
       
    }
    public SpecCala(int color, String owner, int price){
        super(owner, price);
        this.color = color;
    }

   
    
    @Override
    public String toString() {
        System.out.println(super.toString());
        return owner + ", " + price + ", " + color; 
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    //METHOD
    public void setData(){
        String subString = owner.substring(2);
        String supString = owner.substring(0, 1);
        owner = supString + "XX" + subString;
        System.out.println(super.toString());
       
    }
    
    public int getValue(){
        if(color % 2 == 1){
            price += 7;
        } else price += 3;
        return price;
    }
}
