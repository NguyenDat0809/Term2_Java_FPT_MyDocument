
import java.util.Scanner;

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
        
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean flag = true;
        
        int data_money;
        SavingAccount sa1 = new SavingAccount();
        
        
        while(flag == true){
        System.out.println("1. Test savingWithdraw()");
        System.out.println("2. Test savingDeposit()");
        System.out.print("Enter option (1 or 2): ");
        choice = Integer.parseInt(sc.nextLine());
        switch(choice){
            case 1: {
                System.out.print("Enter the money: ");
                data_money = Integer.parseInt(sc.nextLine());
                if(sa1.savingWithdraw(data_money)){
                    System.out.println(sa1.getBalance());
                } else System.out.println("Error, invalid number");
                break;
                
            }
            case 2: {
                System.out.print("Enter the money: ");
                data_money = Integer.parseInt(sc.nextLine());
                if(sa1.savingDeposit(data_money)){
                    System.out.println(sa1.getBalance());
                } else System.out.println("Error, invalid number");
                break;
            }
            default: {
                flag = false;
                break;
            }
        }
        }
     
    }
}
