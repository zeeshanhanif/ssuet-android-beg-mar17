package com.company;

/**
 * Created by Ishaq Hassan on 7/2/2017.
 */
public class Button {
    OnClickListner listner;
    public void setOnClickListner(OnClickListner listner){
        this.listner = listner;
        System.out.println("setOnClickListner!");
    }

    public void click(){
        listner.onClick();
        System.out.println("Clicked!");
    }
}
