package Part1.gui;

import Part1.dto.Item;
import Part1.dto.Painting;
import Part1.dto.Statue;
import Part1.dto.Vase;
import Part1.ui.Menu;
import Part1.ult.ItemList;

import java.util.Scanner;

public class AntiqueShop {
    public static void main(String[] args) {
        // show Menu
        Menu();

        //creat tmp class pointer and ItemList
        Item x = null;
        ItemList list = new ItemList();

        //input choice
        Scanner sc = new Scanner(System.in);
        int choice =0;
        choice = Integer.parseInt(sc.nextLine());

        //get solution
        switch (choice){
            case 1: {
                x = new Vase();
                list.add(x);
                x.input();
                break;
            }
            case 2: {
                x = new Statue();
                list.add(x);
                x.input();
                break;
            }
            case 3: {
                x = new Painting();
                list.add(x);
                x.input();
                break;
            }
            case 4: {
                list.display();
                break;
            }
            case 5: {
                System.out.print("Displaying by creator, input creator: ");
                String data = sc.nextLine().trim();
                if(list.findByCreator(data) == null)
                    System.out.printf("Error");
                else list.displayByCreator(data);
                break;
            }
            case 6: {
                System.out.print("Finding item by value, enter value: ");
                int value = Integer.parseInt(sc.nextLine());
                if(list.findByValue(value) == null)
                    System.out.println("Error");
                else list.findByValue(value).output();
                break;
            }
            case 7: {
                //bỏ qua ko nhớ đề
            }
            case 8: {
                System.out.print("Remove item by VALUE/CREATOR, enter your choice");
                String option = sc.nextLine();
                if(option.equalsIgnoreCase("value")){
                    int data = Integer.parseInt(sc.nextLine());
                    if(list.findByValue(data) == null)
                        System.out.println("Error");
                    else list.removeByValue(data);
                } else {
                        String data = sc.nextLine().trim();
                        if(list.findByCreator(data) == null)
                            System.out.println("Error");
                        else list.removeByCreator(data);
                }
                break;
            }
            case 9: {
                //bỏ qua, dag suy nghĩ để dùng với ArrayList()
            }
            case 10: {
                System.out.print("Sum of value in the stock = ");
                System.out.println(list.sumOfValue());
            }
            case 11: {
                System.out.print("Sum of value in the stock = ");
                System.out.println(list.sumOfValueByCondition());
            }
            case 12: {
                System.out.print("Enter your min: ");
                int min = Integer.parseInt(sc.nextLine());
                System.out.print("Enter your max: ");
                int max = Integer.parseInt(sc.nextLine());
                System.out.println("Your list: ");
                list.getListBetweenMinMax(min, max);
            }
        }

    }
    public static void  Menu(){
        Menu menu = new Menu();
        System.out.println("-------------------------------------");
        System.out.println("       Welcome to Antique shop       ");
        menu.add(" 1. Add a vase");
        menu.add(" 2. Add a statue");
        menu.add(" 3. Add a painting");
        menu.add(" 4. Display all");
        menu.add(" 5. Display item by creator");
        menu.add(" 6. Display item by value");
        menu.add(" 7. Update value");
        menu.add(" 8. Remove item");
        menu.add(" 9. Sort item base on value");
        menu.add("10. Display sum ò value in the stock");
        menu.add("11. Display sum of value (item 's creator are 'VN' in the stock");
        menu.add("12. Get the list of item that have value between min and max");
        menu.add("13. Quit");
        menu.show();
        System.out.print("Choose 1..13: ");
    }
}

