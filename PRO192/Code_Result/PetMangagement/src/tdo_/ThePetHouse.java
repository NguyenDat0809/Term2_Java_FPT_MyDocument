package tdo_;

import data.Pet;
import data.Service;
import ui.Menu;
import ult.PetList;

import java.util.Scanner;

public class ThePetHouse {

    public static void main(String[] args) {
        PetList list = new PetList();

        int menu_choice = 0;
        int quit_option = 6;

        do {
            //show menu
            app_menu_list();

            //user menu_choice
            Scanner sc = new Scanner(System.in);
            System.out.print("Your menu_choice: ");

            menu_choice = Integer.parseInt(sc.nextLine());

            //option method


            switch (menu_choice) {
                case 1: {
                    boolean flag = true;
                    int count = 1;
                    do {
                        System.out.println("Your #" + count + " pet");
                        list.add(app_input_pet());
                        count++;
                        System.out.print("Do you want to add 1 more pet Y/N: ");
                        String tmp = sc.nextLine();
                        if (tmp.equalsIgnoreCase("N"))
                            break;
                    } while (true);
                    break;

                }
                case 2: {
                    System.out.println("Pets in PetHouse");
                    list.display();
                    break;
                }
                case 3: {
                    System.out.print("Your pet' id that you want to use service: ");
                    int data = Integer.parseInt(sc.nextLine());
                    if (list.findById(data) == null)
                        System.out.println("Your pet haven't been add t PetHouse's list, please choose 1 to add Pet");
                    else {
                        Service tam_rua = new Service(1, "Tam rua", 200);
                        Service tia_mong = new Service(2, "Tia mong", 50);
                        Service tia_long = new Service(3, "Tam rua", 200);

                        int service_choice;
                        int service_choice_count = 3;
                        do {
                            app_service_list();
                            System.out.print("Your choice: ");
                            service_choice = Integer.parseInt(sc.nextLine());

                            switch (service_choice) {
                                case 1: {
                                    list.findById(data).addUsedService(tam_rua);
                                    --service_choice_count;
                                    break;
                                }
                                case 2: {
                                    list.findById(data).addUsedService(tia_mong);
                                    --service_choice_count;
                                    break;
                                }
                                case 3: {
                                    list.findById(data).addUsedService(tia_long);
                                    --service_choice_count;
                                    break;
                                }
                                case 4: {
                                    System.out.println("Thank for using out service");
                                    break;
                                }
                            }
                        } while (service_choice != 4 && service_choice_count > 0);
                    } //kết thức else
                    break;
                }
                case 4: {
                    System.out.println("Pet's list by sorting by name");
                    list.sortByName();
                    list.display();
                    break;
                }
                case 5: {
                    System.out.println("Pet's list by sorting by id");
                    list.sortById();
                    list.display();
                    break;
                }
                default: {
                    System.out.println("Bye");
                    break;
                }
            }
        } while (menu_choice != quit_option);

    }

    public static void app_menu_list() {
        Menu app_menu_list = new Menu();

        System.out.println("---------------------------------------------");
        System.out.println("             Welcome to PetHouse             ");
        app_menu_list.add("Add Pet");
        app_menu_list.add("Display pet list");
        app_menu_list.add("Add Services for yout pet");
        app_menu_list.add("Show sorting list by name (decrease)");
        app_menu_list.add("Show sorting list by id (increase)");
        app_menu_list.add("Quit");

        app_menu_list.showOption();
        System.out.print("Choose 1.." + app_menu_list.count + ": ");
    }

    public static Pet app_input_pet() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        String name = sc.nextLine().trim();
        Pet x = new Pet(id, name);
        return x;
    }

    public static void app_service_list() {
        Menu app_service_list = new Menu();
        app_service_list.add("Tam rua - 200");
        app_service_list.add("Cat mong - 50");
        app_service_list.add("Tia Long - 200");
        app_service_list.add("Done");
        app_service_list.showOption();
    }
}
