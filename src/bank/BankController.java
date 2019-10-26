/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hexaguy
 */
public class BankController {
    
    public int sessID;
    
    public BankController(){
        Random rand = new Random();
        this.sessID = rand.nextInt(32);
        System.out.println("Logged in to bank with id : " + this.sessID);
    }
    
    public void handle(){
        
            
            
           
        System.out.println("Creating new Account");
        
       Bank user =  this.createAccount();
        
           while(true){
        
        System.out.println("1. Type 1 to Deposit \n2. Type 2 to Withdraw");
        
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Enter your amount");
                int amount = sc.nextInt();
                user.setClientAccountBalance(amount, "deposit");
                System.out.println("Your new balance is " + user.getClientAccountBalance());
                break;
            case 2:
                System.out.println("Enter your amount");
                int amountToWithdraw = sc.nextInt();
                user.setClientAccountBalance(amountToWithdraw, "withdraw");
                System.out.println("Your new balance is " + user.getClientAccountBalance());
                break;
            default:
                System.out.println("Invalid decision");
        }
            
        }
    }
    
    public Bank createAccount(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your acc username");
        String accName = sc.next();
        System.out.println("Enter your acc. number");
        int accNumber = sc.nextInt();
        
        System.out.println("Enter your full name");
        String name = sc.next();
        
        
        
        return new Bank(accName, accNumber, name);
        
    }
    
}
