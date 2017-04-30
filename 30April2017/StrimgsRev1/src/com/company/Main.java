package com.company;

public class Main {

    public static void main(String[] args) {
	    String hello = "AE";
	    String abc = "Hello World";
	    if(hello.equals(abc)){
            System.out.println("Are Equal");
        }else{
            System.out.println("Not Equal");
        }
        String ids = "1,hello,3,4,5,6";
	    String[] idsInarr = ids.split(",");
        //System.out.println(idsInarr[1]);
        for(int si = 0;si<idsInarr.length;si++){
            System.out.println("Value At "+si+" is : "+idsInarr[si]);
        }

        String xyz = "DA";
        System.out.println(hello.compareTo(xyz));
    }
}
