package com.basicstrong.oops;
class A{

}
// single Inheritance
class B extends A{

}
//Multilevel Inheritance
class C extends B{

}
//Multiple Inheritance
interface  AA{
    default void  method(){
        System.out.println("method AA");
    }
}
interface AAA{
    default void  method(){
        System.out.println("method AAA");
    }
}
class BB implements AA,AAA{
    @Override
    public void method(){
        AA.super.method();
    }
}
//Hierarchical A-.AA,BB single parent,multiple children
//hybrid : Multiple + Multilevel
public class InheritanceDemo {
    public static void main(String[] args){

    }
}
