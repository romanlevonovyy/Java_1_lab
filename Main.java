package com.company;

public class Main {

    public static void main(String[] args) {
        Cat vasa = new Cat();
        Cat pushok = new Cat(" Pushok ", 12, " red ", 4);
        Cat murchik = new Cat(" Murchik ", 10, " black ", 6, " Siam ");

        vasa.setName(" Vasa ");
        vasa.setAge(15);
        vasa.setWeight(7);
        vasa.setColor(" Gray ");
        vasa.setBreed(" Toiger ");
        System.out.println(Vasa);
        System.out.println(Pushok);
        System.out.println(Murchik);
        Cat.printStaticSum();
        vasa.printSum();
        pushok.printSum();
        murchik.printSum();
        vasa.resetValue(3, " Safari "," black ", " Kolia ", 2);
        pushok.resetValue(1, " Savanna ", " yelow ", " Lubomir ", 5);
        murchik.resetValue(5, " American ", " grey ", " Shenia ", 3);
        System.out.println(Vasa);
        System.out.println(Pushok);
        System.out.println(Murchik);
        Cat.printStaticSum();
        vasa.printSum();
        pushok.printSum();
        murchik.printSum();



    }
}
