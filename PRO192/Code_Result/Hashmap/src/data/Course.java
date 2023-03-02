/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 84859
 */
public class Course {
        private String name;
        private int credit;
        
        
public Course(){
    
}

    public Course(String name, int credit) {
        this.name = name;
        this.credit = credit;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", credit=" + credit + '}';
    }
    

}
