/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 84859
 */
public class Cala {
    protected String owner;
    protected int price;
    
    public Cala(){
        owner = null;
        price = 0;
    }

    public Cala(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }
    
    public int getPrice() {
        return price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }


    
    @Override
    public String toString() {
        return owner + "," + price;
    }
    
}
