package ult;

import data.Pet;

import java.util.ArrayList;

public class PetList extends ArrayList<Pet>{ //extends từ ArrayList<>
    // => có thể hiểu dag có 1 mảng ArrayList ẩn, ko dc nói ra
    //vì ArrayList để mảng buffer đó private

    //=> ta có thể dùng this trong Class này để chỉ mảng buffer đó


    public PetList(){

    }
    public boolean addPet(Pet x){
        return add(x);
    }
    public void display(){
        for (Pet x : this ) {
            x.output();
        }
    }
    public Pet findById(int key_data){
        for (Pet x : this) {
            if(x.getId() == key_data)
                return x;
        }
        return null;
    }
    public void sortById(){ //increasing sort
        this.sort(((o1, o2) -> Integer.compare(o1.getId(), o2.getId())));
        //sort số thì như này sẽ từ nhỏ đến lớn
        display();
    }
    public void sortByName(){
        this.sort(((o1, o2) -> String.CASE_INSENSITIVE_ORDER.reversed().compare(o1.getName(), o2.getName())));
    }
}