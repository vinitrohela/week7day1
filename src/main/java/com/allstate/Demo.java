package com.allstate;
import java.util.ArrayList;

/**
 * Created by localadmin on 02/01/17.
 */
public class Demo {
    public static void main(String[] args){
        Vampire v1 =new Vampire("Vlad");
        Fish f1 = new Fish("Nemo");

        ArrayList<Creature> creatures = new ArrayList<Creature>();
        for(int i=0; i <10; i++) {
            int coinToss = (int)(Math.random()*2);
            if(coinToss == 0){
                creatures.add(new Vampire("Vald" +i));
            }
            else{
                creatures.add(new Fish("Nemo" +i));
            }
        }

        for(int i=0; i<1000; i++){
            int c1 = (int)(Math.random()*10);
            int c2 = (int)(Math.random()*10);
            creatures.get(c1).fight(creatures.get(c2));
        }
        System.out.println(creatures);
//        System.out.println("Hello world");
//        Dog d1 = new Dog();
//        Dog d2 = new Dog((byte) 3, "Molly");
//
//        for (int i=0; i <20; i++){
//            d2.sleep();
//            d2.sick();
//        }
//        System.out.println(d2);
    }
}
