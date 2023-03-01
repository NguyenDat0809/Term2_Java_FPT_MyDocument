/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Customer {
    private String name;
    private PetList bosses;
    public Customer(){
        name = "khach hang";
        bosses = new PetList();
    }

    public String getName() {
        return name;
    }

    public PetList getBosses() {
        return bosses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBosses(PetList bosses) {
        this.bosses = bosses;
    }
    public void output(){
        System.out.println("Customer name: " + name);
        System.out.println("Danh sach boss cua ban");
        bosses.displayPets();
        System.out.println("Tien can tra doi voi bosses" + getPaidMoney());
    } 
    //ham nay de thjem 1 pet vao bosses 
    public void addPet(Pet p){
        if(bosses.addPet(p)) System.out.println("da them thong tin pet chop ban");
        else System.out.println("Khong the them pet, Vui long thu lai");
    }
    //ham nay  de giet 1 con boss re khoi bosses
    public void removePet(int id){
        if(bosses.removePet(id))
            System.out.println("da xoa boss cua ban");
        else System.out.println("Khong the xoa");
    }
    //ham nay tinh tien cho cac boss trong bosses
    public int getPaidMoney(){
        int total = 0;
        for (Pet p : bosses) {
            total = total + p.getTotalMoney();
        }
        return total;
    }
}
