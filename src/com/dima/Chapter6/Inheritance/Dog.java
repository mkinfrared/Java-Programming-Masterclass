package com.dima.Chapter6.Inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Nyam-nyam!");
    }

    @Override
    public void eat() {
        System.out.println("Dog:");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() is called");
        move(5);
    }

    public void run () {
        System.out.println("RUN CJ, RUN!");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() CALLED");
        super.move(speed);
    }
}
