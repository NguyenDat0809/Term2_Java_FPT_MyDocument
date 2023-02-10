/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author 84859
 */
public class Circle {
    public  double x;
    public double y;
    public double r;
    
    Scanner sc = new Scanner(System.in);
    public Circle(){
        x = 0;
        y = 0;
        r = 0;
    }
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public Circle(Circle x){
        this.x = x.x;
        this.y = x.y;
        this.r = x.r;
    }
    //x,y là số, r là số dương
    //
    public void inputCircle(){
        while (true){
            try{
                System.out.print("input x ");
                x = Double.parseDouble(sc.nextLine()); //chống Enter
                break;
            } catch (Exception e){
                System.out.println("Error input");
            }
        }
        while (true){
            try{
                System.out.print("input y ");
                y = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Error input");
            }
        }
        while (true){
            try{
                System.out.print("input r ");
                r = Double.parseDouble(sc.nextLine());
                if(r < 0)   throw new Exception();
                break;
            } catch (Exception e){
                System.out.println("Error input");
            }
        }
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(r > 0) {
            this.r = r;
        }
    }

    public void outputCircle(){
        System.out.printf("|CIRCLE|%4.1f|%4.1f|%4.1f|\n",
                x, y, r);
    }
    public double getDistance(double x2, double y2){
        return Math.sqrt((x - x2) * (x - x2)+(y - y2) * (y - y2));
    }
}
