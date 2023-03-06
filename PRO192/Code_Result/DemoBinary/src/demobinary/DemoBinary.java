/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobinary;

/**
 *
 * @author 84859
 */
public class DemoBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DemoCopyPaste obj = new DemoCopyPaste();
        byte data[] = obj.copyFile("2022-09-16-19-37-43_0.png");
        obj.pasteCopiedFile(data, "2022-09-16-19-37-43_0copy.png");
    }
    
}
