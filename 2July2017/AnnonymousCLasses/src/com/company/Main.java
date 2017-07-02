package com.company;

public class Main {

    public static void main(String[] args) {
        MyClick listner = new MyClick();
        //listner.onClick();

        Button btn = new Button();
        btn.setOnClickListner(listner);
        btn.click();
    }
}
