package com.demo.listviewcustomadapter;

/**
 * Created by Ishaq Hassan on 9/10/2017.
 */

public class Contact {
    private int image;
    private String name;
    private String contactNo;

    public Contact(int image, String name, String contactNo) {
        this.image = image;
        this.name = name;
        this.contactNo = contactNo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
