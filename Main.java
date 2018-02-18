package com.company;

public class Main {

    public static void main(String[] args) {
        Cat Vasa = new Cat();
        Cat Pushok = new Cat(" Pushok ", 12, " red ", 4);
        Cat Murchik = new Cat(" Murchik ", 10, " black ", 6, " Siam ");

        Vasa.setName(" Vasa ");
        Vasa.setAge(15);
        Vasa.setWeight(7);
        Vasa.setColor(" Gray ");
        Vasa.setBreed(" Toiger ");
        System.out.println(Vasa);
        System.out.println(Pushok);
        System.out.println(Murchik);
        Cat.printStaticSum();
        Vasa.printSum();
        Pushok.printSum();
        Murchik.printSum();
        Vasa.resetValue(3, " Safari "," black ", " Kolia ", 2);
        Pushok.resetValue(1, " Savanna ", " yelow ", " Lubomir ", 5);
        Murchik.resetValue(5, " American ", " grey ", " Shenia ", 3);
        System.out.println(Vasa);
        System.out.println(Pushok);
        System.out.println(Murchik);
        Cat.printStaticSum();
        Vasa.printSum();
        Pushok.printSum();
        Murchik.printSum();



    }
}
