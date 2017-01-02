package com.allstate;

/**
 * Created by localadmin on 02/01/17.
 */
public class Dog {
    private int health;
    private int food;
    private byte age;
    private String name;

    public Dog(){
        this((byte) 1, "Fide");
    }

    public Dog(byte age, String name){
        this(age, name, 50, 50);
    }

    public Dog(byte age, String name, int health, int food){
        this.age = age;
        this.name = name;
        this.health = health;
        this.food = food;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static long getRandom(){
        return Math.round(Math.random() * 10);
    }

    private boolean isDeath(){
        return this.food <=0 || this.health <=0;
//        if(this.food <= 0 || this.health <= 0) {
//            return true;
//        }
//        return false;
    }

    public void sleep(){
        System.out.println("sleeping");
        long random = Dog.getRandom();
        this.food -= random;
        this.health += random;
        if(isDeath()){
            System.out.println(this + " : is Dead");
        }
    }

    public void sick(){
        long random = Dog.getRandom();
        this.food -= random;
        this.health -= random;
        if(isDeath()){
            System.out.println(this + " : is Dead");
        }
    }

    @Override
    public String toString() {
        return "Dog{" + name + " - " +age+ " - " + health + " - " +food+'}';
    }
}
