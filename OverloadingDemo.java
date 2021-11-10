package com.basicstrong.oops;
class Addition{
    public void sum(int a,int b){
        System.out.println("Sum is : "+(a+b));
    }
    public void sum(int a,int b,int c){
        System.out.println("Sum is : "+(a+b+c));
    }
    public void sum(double a,double b,double c){
        System.out.println("Sum is : "+(a+b+c));
    }
}
public class OverloadingDemo {
    public static void main(String[] args){
        Addition add = new Addition();
        add.sum(10,15);
        add.sum(10,15,25);
        add.sum(10.35,15.12,25.34);
        add.sum(10.25f,15.20,45.3);
        //byte -> short ->int ->long -> float ->doube
        //                 ^
        //                 |
        //                 char
    }
}
