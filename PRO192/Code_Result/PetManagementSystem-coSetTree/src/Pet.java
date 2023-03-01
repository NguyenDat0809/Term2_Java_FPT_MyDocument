
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
//Pet co id, name va cac dv ma con pet no sd
public class Pet implements Comparable<Pet>{
    private int id;
    private String name;
    private ArrayList<Service> listservice;
    
    public Pet(){
        id=1;
        name= "tester";
        listservice= new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Service> getListservice() {
        return listservice;
    }

    public void setListservice(ArrayList<Service> listservice) {
        this.listservice = listservice;
    }

    
    
    //ham nay de nhap thong tin cua 1 con pet
    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter Pet's id:");
        id= sc.nextInt();
        sc= new Scanner(System.in);
        System.out.println("enter Pet's name");
        name=sc.nextLine();
        //listServic de them dich vu sau nay
    }
    
    //ham nay de them 1dvu cho con pet
    //tra ve true/false
    public boolean addUsedService(Service s){
        return listservice.add(s);
    }
    //ham nay de xuat thtin con Pet
    //gom: id, name, ds dich vu ma no su dung
    public void output(){
        System.out.println("Pet's id: "+id);
        System.out.println("Pet's name: "+name);
        System.out.println("Cac service cua Pet:");
        sortUsedServiceById();
        for(Service tmp: listservice){
            System.out.println(tmp.toString());
        }
    }
    
    //ham nay de sap xep tang dan theo id cua service 
    public void sortUsedServiceById(){
        Collections.sort(listservice);
    }

    @Override
    public int compareTo(Pet o) {
        if(name.compareTo(o.getName())>0){
            return 1;
        }
        else if(name.compareTo(o.getName())>0){
            return -1;
        }
        return 0;
    }
    //ham nay de tinh sum cac price co tring usedService
    public int getTotalMoney(){
        int sum = 0;
        for (Service s : listservice) {
            sum = sum + s.getPrice();
        }
        return sum;
    }
}
