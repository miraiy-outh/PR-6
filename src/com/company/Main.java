package com.company;

public class Main {

    public static void main(String[] args) {
        MovableRectangle rectangle1 = new MovableRectangle(1, 1, 2, 3, 1, 1, 1, 1);
        System.out.println(rectangle1.toString());
        System.out.println(rectangle1.simular());
    }
}
