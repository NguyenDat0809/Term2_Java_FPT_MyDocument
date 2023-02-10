/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothrows;

/**
 *
 * @author 84859
 */
public class Pet {
    int id;
    String name;
    public Pet(){

    }
    public  void input() throws  Exception{
        id = MyLib.inputNumber(1, 1000);
    }

    public static void main(String[] args) {
        Pet a = new Pet();
        try{
            a.input();
        } catch (Exception e){
            System.out.println("Error");
        }
    }
    
}
