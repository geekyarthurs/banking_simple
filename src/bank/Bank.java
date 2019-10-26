/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author hexaguy
 */
public class Bank {
    
    public Bank(String clientAccountName, int clientAccountNumber, String clientName) {
        this.clientAccountName = clientAccountName;
        this.clientAccountNumber = clientAccountNumber;
        this.clientAccountBalance = 0;
        this.clientName = clientName;
    }
    
    private String clientAccountName;
    private int clientAccountNumber;
    private double clientAccountBalance;
    private String clientName;
    
    public String getClientAccountName() {
        return clientAccountName;
    }
    
    public void setClientAccountName(String clientAccountName) {
        this.clientAccountName = clientAccountName;
    }
    
    public int getClientAccountNumber() {
        return clientAccountNumber;
    }
    
    public void setClientAccountNumber(int clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }
    
    public double getClientAccountBalance() {
        return clientAccountBalance;
    }
    
    public void setClientAccountBalance(double clientAccountBalance, String type) {
        if (type.equals("deposit")) {
            this.clientAccountBalance = clientAccountBalance;
        } else {
            if(clientAccountBalance > this.clientAccountBalance){
                System.out.println("Balance insufficient");
                return;
            }
            this.clientAccountBalance -= clientAccountBalance;
        }
    }
    
    public String getClientName() {
        return clientName;
    }
    
    public void setClientName(String clientName) {
        this.clientName = clientName; //testing
    }
    
}
