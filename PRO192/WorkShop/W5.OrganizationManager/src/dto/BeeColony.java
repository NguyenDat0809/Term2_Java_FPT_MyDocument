/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author 84859
 */
public class BeeColony extends Colony implements Role {
    private String type; //honey or wasp production
    public BeeColony(){

    }
    public BeeColony(int size, String place, String type){
        super(size, place);
        this.type = type;
    }

    @Override
    public String toString() {
        return "the colony's type " + type + ", size is about " + size +
                ", and the place is " + place ;
    }

    @Override
    public void creatWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
}
