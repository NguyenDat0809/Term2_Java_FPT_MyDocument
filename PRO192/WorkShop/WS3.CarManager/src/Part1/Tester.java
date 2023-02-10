/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarManager;

/**
 *
 * @author 84859
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c1 = new Car("RAINBOW", 500, true, false);
        c1.pressStartButton();
        c1.pressAccerleratorbutton();
        c1.output();

        Car c2 = new Car("RED", 100, true,true);
        c2.pressStartButton();
        c2.pressAccerleratorbutton();
        c2.output();
    }
    
}
