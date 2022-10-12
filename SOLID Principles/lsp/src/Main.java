package com.solid.lsp;

public class Main {
    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        Shape reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = "+ ((Rectangle)reg1).getWidth());
        System.out.println("Height = "+ ((Rectangle)reg1).getHeight());
        System.out.println("Area = " + reg1.getArea());


        Shape req2 = new Square(5);
        System.out.println("====  Square  ====");
        System.out.println("Side = " + ((Square)req2).getSide());
        System.out.println("Width = " + req2.getArea());






    }
}