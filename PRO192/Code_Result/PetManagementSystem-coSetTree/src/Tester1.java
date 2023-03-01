/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Tester1 {
    public static void main(String[] args) {
        Pet p= new Pet();
        p.input();
        Service s1= new Service(1, "tia long", 100);
        if(p.addUsedService(s1)){
            System.out.println("da them dich vu");
        }
        Service s2= new Service(20, "tam", 200);
        if(p.addUsedService(s2)){
            System.out.println("da them dich vu");
        }
        Service s3= new Service(10, "cat mong", 50);
        if(p.addUsedService(s3)){
            System.out.println("da them dich vu");
        }
        System.out.println("Thong tin Pet:");
        p.output();
        
        Pet p2= new Pet();
        p2.input();
        if(p2.addUsedService(s1)){
            System.out.println("ds them dv cho p2");
        }
        if(p2.addUsedService(s2)){
            System.out.println("ds them dv cho p2");
        }
        p2.output();
        
        //add p1,p2 vao PetList
        PetList a= new PetList();
        if(a.add(p)){
            System.out.println("da them pet vao pet list");
        }
        if(a.add(p2)){
            System.out.println("da them pet vao pet list");
        }
        System.out.println("DS Pet trong he thong");
        a.sortPetListByName();
        a.displayPets();
        
        
    }
}
