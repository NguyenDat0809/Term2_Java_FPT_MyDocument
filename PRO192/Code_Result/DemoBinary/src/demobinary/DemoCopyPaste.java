/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobinary;

import java.awt.datatransfer.DataFlavor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author 84859
 */
public class DemoCopyPaste {

    //hàm này đọc 1 file nhị phân
    //trả về array of bytes
    public byte[] copyFile(String file_name) {
        //copy file vào trong bộ nhớ
        byte[] rs = null;
        FileInputStream fis = null;

        
        try {
            File f = new File(file_name);
            if(f.exists()){
                fis = new FileInputStream(file_name);
                rs = new  byte[fis.available()];
                fis.read();
                
        }
        } catch (Exception e) {
            System.out.println("ERROR");
        } finally {
            try {

            } catch (Exception e) {
                System.out.println("Error");
            }
        }
        return rs;
    }
    //method ghi mảng nhi phân vào file binary
    public void pasteCopiedFile(byte[] data, String file_name){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file_name);
            fos.write(data);
            
        } catch (Exception e) {
            System.out.println("Error");
        } finally{
            try {
                if(fos != null)
                    fos.close();
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
