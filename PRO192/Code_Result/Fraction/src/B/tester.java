/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

import A.Fraction;

/**
 *
 * @author 84859
 */
public class tester {
    public static void main(String[] args) {
        Fraction A = new Fraction(1, 2);
        Fraction B = new Fraction(3, 4);

        Fraction C = A.add(B).shorten();

        Fraction D = A.sub(B);
        Fraction E = A.div(B);
        Fraction F = A.mul(B);

        System.out.println("After adding and shorten: " + C.getNum() + "/" + C.getDeno());
        System.out.println("After subtracting: " + D.getNum() + "/" + D.getDeno());
        System.out.println("After div: " + E.getNum() + "/" + E.getDeno());
        System.out.println("After mul: " + F.getNum() + "/" + F.getDeno());
    }
    
}
