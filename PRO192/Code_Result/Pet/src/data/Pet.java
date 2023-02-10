/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author 84859
 */
public class Pet {
    private int id;
    private String name;
    private String bday;


    Scanner sc = new Scanner(System.in);


    public Pet() {

    }

    public Pet(int id, String name, String bday) {
        this.id = id;
        this.name = name;
        this.bday = bday;
    }

    public Pet(Pet x) {
        id = x.id;
        name = x.name;
        bday = x.bday;
    }

    public Pet(String name) {
        id = 0;
        this.name = name;
        Date d = new Date(); //Class cho phép thời gian đồng hồ
        bday = d.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (!name.equals(null) && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getBday() {
        //SimpleDateFormat: thư viện sử dụng format thời gian

        //bDay dc trả về dưới format: day/month/year
        //bDay có thể ở format: bDay = "25/12/2000" hoặc "12/25/2000" hoặc "25-12-2002"
        String tmp[] = bday.split("[/-]"); //regex: là kí tự
        //".split("[/-]")": hàm cắt String ra khi gặp
        //                                                              các kí tự trong []
        return tmp[2] + "-" + tmp[1] + "-" + tmp[0];
    }

    public void setBday(String bday) {
        if (!bday.equals(null) && !bday.isEmpty()) {
            this.bday = bday;
        }
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", name=" + name + ", bday=" + bday + ", sc=" + sc + '}';
    }

    public void inputPet() {

        while (true) {
            try {
                System.out.print("Input id: ");
                id = Integer.parseInt(sc.nextLine().trim());
                if (id < 0) {
                    throw new /*InputMismatchException();*/ Exception(); //để lỗi cụ thể không thể gọi Exceoption chung
                }
                break;
            } catch (/*InputMismatchException*/ Exception e) {   //bắt lỗi cụ thể
                //ví dụ ở đây là lỗi Input làm Java giết app
                System.out.println("Your id is invalid");
            }
        }
        while (true) {
            try {
                System.out.print("Input name: ");
                name = sc.nextLine().trim();
                if (name.isEmpty()) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {   //bắt lỗi chung chung
                System.out.println("Your name is invalid");
            }
        }
        while (true) {
            try {
                System.out.print("Input birthday: ");   //show requirement for user

                Date tmp = new Date();  //creat Date Class
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                    //dùng formatter để thao tác input
                    //vì Date không thể dùng với Scanner
                tmp =formatter.parse(sc.nextLine()); //convert inputed String -> Date (tmp)
                bday = formatter.format(tmp);   //convert Date -> String (bday)
                break;

            } catch (Exception e) {
                System.out.println("error");
            }
        }
        }
        public void showPet() {
            System.out.printf("|%-10d|%-10s|%-10s|\n",
                    id, name, bday);
        }
    }

