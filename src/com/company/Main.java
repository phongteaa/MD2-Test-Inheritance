package com.company;

public class Main {
    public static void main(String[] args) {

        MountainBicycle mb = new MountainBicycle(3, 80, 40);
        System.out.println("\nMountain bicycle ------>");
        System.out.println(mb);

        KidBicycle kb = new KidBicycle(1, 20, 3);
        System.out.println("\nKid bicycle ------>");
        System.out.println(kb);
    }
}

