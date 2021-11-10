package com.basicstrong.oops;
class Account{
    private double balance;
    public void setBalance(int number){
        this.balance = number;
    }
    public double getBalance(){
        return this.balance;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args){
        Account acc = new Account();
        acc.setBalance(5000);
        System.out.println("Account balance is : "+acc.getBalance());
    }
}
