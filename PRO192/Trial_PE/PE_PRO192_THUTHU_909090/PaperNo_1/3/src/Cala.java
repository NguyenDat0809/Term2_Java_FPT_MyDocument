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
    private String owner;
    private int price;
    
    public Cala(){
        
    }

    public Cala(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cala{" + "owner=" + owner + ", price=" + price + '}';
    }

//    @Override //Trường hợp cần số sánh số: int
//    public int compareTo(Cala o) { 
//       if(price > o.getPrice())
//           return 1;
//       else if(price < o.getPrice())
//           return -1;
//       return 0;
//    }

    
    
}
