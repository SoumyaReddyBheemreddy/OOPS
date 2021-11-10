package com.basicstrong.oops;

import java.util.ArrayList;

interface Mobile{
    public void calling(String number);
    public void sendMessage(String messasge);
}

class Apple implements Mobile{
    private ArrayList<String> contacts = new ArrayList<>();
    public void addContact(String number) {
        contacts.add(number);
    }
    @Override
    public void calling(String number) {
        System.out.println("Callig ...."+number);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message ....."+message);

    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        Apple myPhone = new Apple();
        myPhone.calling("8696455212");
        myPhone.sendMessage("Hello");
        myPhone.addContact("6030479894");

        Samsung  myNewPhone = new Samsung();
        myNewPhone.addContact("9876543210");
        myNewPhone.calling("abc");
        myNewPhone.sendMessage("Hello world ");
    }
}
abstract class NewMobile{
    ArrayList<String> contacts = new ArrayList<>();
    abstract void calling(String number);
    abstract void sendMessage(String message);
    public void addContact(String number) {
        contacts.add(number);
    }
}
class Samsung extends NewMobile{


    @Override
    void calling(String number) {
        System.out.println("Callig  from samsumg...."+number);

    }

    @Override
    void sendMessage(String message) {
        System.out.println("Sending message from samsung ...."+message);

    }

}

