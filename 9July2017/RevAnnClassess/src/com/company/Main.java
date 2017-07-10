package com.company;

public class Main {

    public static void main(String[] args) {
        Test tst = new Test();
        /*Pakistani st1 = new Student();
        tst.setNationality(st1);*/

        tst.setNationality(new Pakistani() {
            @Override
            public void doStudy() {
                System.out.println("Hello World From Ann CLass");
            }
        });
        tst.callDoStudy();
        tst.pakistani.doStudy();
        /*tst.setNationality(pak1);
        tst.setNationality(pak1);*/


        Human st = new Student();


        Button btn = new Button();
        btn.setOnClickListner(new OnClickListner() {
            @Override
            public void onClick() {

            }
        });

    }
}
