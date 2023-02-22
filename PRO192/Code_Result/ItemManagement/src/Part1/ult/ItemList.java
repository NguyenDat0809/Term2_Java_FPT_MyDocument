package Part1.ult;

import Part1.dto.Item;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ItemList {
    ArrayList <Item> itemList= new ArrayList<Item>();

    public ItemList() {
    }

    //ADD METHOD
    public void add(Item x){
        itemList.add(x);
    }
    //DISPLAY METHOD
    public void display(){
        for (Item x : itemList) {
            x.output();
        }
    }

    public void displayByCreator(String line){
        for (Item x : itemList) {
            if(x.getCreator().equalsIgnoreCase(line)) {
                System.out.println(x);
            }
        }
    }


    //FINDING METHOD
    public Item findByCreator(String creator){
        for (Item x : itemList) {
            if(x.getCreator().equalsIgnoreCase(creator))
                return x;
        }
        return null;
    }
    public Item findByValue(int value){
        for (Item x : itemList) {
            if(x.getValue() == value)
                return x;
        }
        return null;
    }
    public int findIndexByValue(int value){
        for (Item x : itemList) {
            if(x.getValue() == value)
                return itemList.indexOf(x);
        }
        return -1;
    }
    //UPDATE ITEM


    //REMOVE ITEM
    //1 is success
    //0 is fail
    public int remove(Item x){
        itemList.remove(x);
        return 1;
    }
    public int removeByValue(int value){
        for (Item x : itemList) {
            if(x.getValue() == value) {
                itemList.remove(x);
                return 1;
            }
        }
        return 0;
    }
    public int removeByCreator(String creator){
        for (Item x : itemList) {
            if(x.getCreator().equalsIgnoreCase(creator)) {
                itemList.remove(x);
                return 1;
            }
        }
        return 0;
    }

    //SORTING METHOD
        //suy nghĩ cách dùng sort của ArrayList, Collections, Comparasion
    //GETSUM
    public int sumOfValue(){
        int sum = 0;
        for (Item x : itemList) {
            sum += x.getValue();
        }
        return sum;
    }
    public int sumOfValueByCondition(){
        int sum = 0;
        for (Item x : itemList) {
            if(x.getCreator().equalsIgnoreCase("VN"))
                sum += x.getValue();
        }
        return sum;
    }
    public void getListBetweenMinMax(int min, int max){
        for (Item x : itemList) {
            if(x.getValue() >= min && x.getValue() <= max){
                System.out.print(x );
            }
        }
    }
}
