package com.company;

public class Main {

    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.name);
        st.name = "Usman";
        st.age = 30;
        st.id = 100;
        st.isFeePaid = true;
        st.email = "xyz@abc.com";

        Student st1 = new Student();
        st1.name = "Parkash";
        st1.age = 40;
        st1.id = 101;
        st1.isFeePaid = false;
        st1.email = "abc@xyz.com";


    }
}
