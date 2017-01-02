package com.allstate;

/**
 * Created by localadmin on 02/01/17.
 */
public class Fish extends Creature{
    public Fish(String name) {
        super(50, name, "Fliper", 1);
    }

    public void fight(Creature c) {
        int damage = (int)Math.random() * this.damage;
        String s = this + " is fighting " + c + "with damage" + damage;
        System.out.println(s);
        c.hitPoints -= damage;
    }

    public void heal() {
        this.hitPoints += (int)Math.random() * this.damage;
    }
}
