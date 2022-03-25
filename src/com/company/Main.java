package com.company;

public class Main {

    public static void main(String[] args) {
        int []array = { 4, 5, 7, 11, 12, 15, 15, 21, 40, 45 };
        Ex1 Exercise1=new Ex1();
        System.out.println(Exercise1.searchIndex(array,15));
        Ex2 Exercise2=new Ex2();
        System.out.println(Exercise2.convert("This is example text ..."));
        Ex3 Exercise3= new Ex3();
        Exercise3.MyLocalTime();
        Exercise3.GlobalTime();
        Ex4 Exercise4 = new Ex4();
        Exercise4.getData();
    }
}
