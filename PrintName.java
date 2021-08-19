package com.headFirst.designPatttern;

public class PrintName {
    private String name;

    public PrintName(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String printName(){
        return "My Name is "+getName();
    }

    public static void main(String []args){
        System.out.println(new PrintName("Patrick Udoh").printName());


    }
}
