
import com.sun.org.apache.bcel.internal.generic.DSUB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 84859
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Cala> ds = new ArrayList<>();
        Cala c1 = new Cala("A8", 7);
        ds.add(c1);
        Cala c2 = new Cala("B1", 3);
        ds.add(c2);

        Cala c3 = new Cala("C7", 1);
        ds.add(c3);

        Cala c4 = new Cala("D2", 3);
        ds.add(c4);

        Cala c5 = new Cala("E6", 6);
        ds.add(c5);

        Cala c6 = new Cala("F3", 5);
        ds.add(c6);

        MyCala service = new MyCala();
        //done f1
//        System.out.println(service.f1(ds));

        //done f2
//        service.f2(ds);
//        for (Cala x : ds) {
//            System.out.println(x.toString());
//        }

        //done f3
        service.f3(ds);
        for (Cala x : ds) {
            System.out.println(x.toString());
        }
    }

}
