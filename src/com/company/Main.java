package com.company;

public class Main {
    public static void main(String[] args) {

        MountainBicycle mb = new MountainBicycle(3, 100, 40);
        System.out.println("\nMountain bicycle ------>");
        System.out.println(mb.toString());

        KidBicycle kb = new KidBicycle(1, 50, 3);
        System.out.println("\nKid bicycle ------>");
        System.out.println(kb.toString());
    }
}

