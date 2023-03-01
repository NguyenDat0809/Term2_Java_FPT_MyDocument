
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class PetList extends ArrayList<Pet>{
    //ham nay de them 1 con Pet vao PetList
    public boolean addPet(Pet p){
        return add(p);
    }
    //ham nay de xuat ds cac con Pet trong PetList
    public void displayPets(){
        
        for(Pet p: this){
            p.output();
        }
    }
    
    //ham nay de sap xep tang dan petList dua tren petID
    public void sortPetListByName(){
        Collections.sort(this);
    }
    //ham nay de tra ve vi tri con pet trong petlist
    //dua vao id cua Pet
    public int findPet(int id){
        for (int i = 0; i < size(); i++) {
            if(get(i).getId() == id) return i;
        }
        return -1;
    }
    //ham nay de xoa 1 con pet ra khoi PetList khi co id
    public boolean removePet(int id){
        int k = findPet(id);
        if(k >= 0){
            remove(k);
        }
        return false;
    }
}
