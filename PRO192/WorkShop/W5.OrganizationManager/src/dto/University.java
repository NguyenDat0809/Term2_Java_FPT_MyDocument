/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 *
 * @author 84859
 */
public class University extends Organization {
    protected String name;
    public University(){

    }

    public University(int size, String name){
        super(size);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void enroll(){
        System.out.println("The registration for enrollment is only valid" +
                "when the University has received all enrollment documents and enrollment fees");
    }
    public void educate(){

    }
    @Override
    public void communicateByTool() {
        System.out.println("provide education at university standard");
    }

    @Override
    public String toString() {
        return "encourage the advancement and development of knowledge";
    }
}
