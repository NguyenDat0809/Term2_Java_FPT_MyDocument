/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import data.StudentList;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import ui.Menu;

import java.util.Scanner;

/**
 *
 * @author 84859
 */
public class StudentManagement {

    public static void main(String[] args) {
        //options
        String options[] = {"Add new student", "Search a student", "Update name and mark",
                            "Remove a student", "List all", "Quit"};
        //user choice
        int choice;

        //creat StudentList object
        StudentList list = new StudentList();

        //Show menu and  Add method
        do{
            System.out.println("\nStudent managing Program");
            choice = Menu.getChoice(options);
            switch (choice){
                case 1: list.addStudent();  break;  //add new student
                case 2: list.searchStudent();  break;  //search student
                case 3: list.updateStudent();  break;  //update name and mark
                case 4: list.removeStudent();  break;  //remove student
                case 5: list.printAll();  break;  //print all students
                default:
                    System.out.println("Bye!");
            }
        } while (choice > 0 && choice < 6);

    }
}
