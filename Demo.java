package com.basicstrong.oops;

class Fan{
    public boolean isOn;
    public static int statVar;
    public void turnOn() {
        this.isOn = true;
        System.out.println("Fan is spining");
    }
    public void turnOff() {
        this.isOn = false;
        System.out.println("Fan is stopped");
    }
}
public class Demo {
    public static void main(String []args) {
        Fan myFan = new Fan();
        myFan.turnOn();
        myFan.turnOff();

        Fan yourFan = new Fan();
        yourFan.isOn = true;
        Fan.statVar = 4;
    }
}
