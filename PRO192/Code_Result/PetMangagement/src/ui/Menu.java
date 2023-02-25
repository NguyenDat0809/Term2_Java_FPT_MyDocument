package ui;

import java.util.ArrayList;

public class Menu  extends ArrayList <String>{
    public int count = 0;
    public Menu(){

    }
    public void addOption(String data){
        this.add(data);
    }
    public void showOption(){
        for (String x : this) {
            System.out.println((++count) + " " + x);
        }
    }
    public void removeOption(int index){
        this.remove(index);

    }
}
