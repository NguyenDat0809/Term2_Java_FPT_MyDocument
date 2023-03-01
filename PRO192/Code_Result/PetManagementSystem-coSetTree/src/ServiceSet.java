
import java.util.Iterator;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ServiceSet extends TreeSet<Service>{
    public boolean addService(Service s){
        return add(s);  //lenh nay chi run duoc neu trong lop service co ham compareTo de so sanh
    }
    //Xuat cay tu Left Node Right
    //ham nay de xuat tap cac serccice trong service trong serviceset theo trat tu tang dan cua id
    public void displayAll(){
        for(Service s: this){
            System.out.println(s);
        }
    }
    //xuat cay tu Right Node Left
    public void displayAll_RNL(){
        Iterator<Service> s = descendingIterator(); //descendingIterator() la duyet cay tu Right Node Left
        while(s.hasNext()){
            System.out.println(s.next().toString());
        }
    }
    //ham nay de tra ve Service dua tren id\
    public Service getServiceById(int id){
        for (Service s : this) {
            if(s.getId() == id) return s;
        }
        return null;
    }
}
