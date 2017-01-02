package com.allstate;

/**
 * Created by localadmin on 02/01/17.
 */
public class Demo {
    public static void main(String[] args){
        System.out.println("Hello world");
        Dog d1 = new Dog();
        Dog d2 = new Dog((byte) 3, "Molly");
        for (int i=0; i <20; i++){
            d2.sleep();
            d2.sick();
        }
        System.out.println(d2);
        System.out.println(d2);
    }
}
