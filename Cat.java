package com.company;

public class Cat {
    private String color;
    private int weight;
    private String breed;
    private String name;
    private int age;
    public static int totalAge = 0;

    public Cat(){

    }

    public Cat(String name, int age, String color, int weight){

        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;

    }

    public Cat(String name, int age, String color, int weight, String breed){

        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.breed = breed;

    }

    public int getAge() {
        totalAge = totalAge - this.age + age;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public String toString() {
        return " Age " + getAge()+" Color "+getColor()+" name "+getName()+" Breed "+getBreed()+" Weight "+getWeight();
    }

    static void printStaticSum(){
        System.out.println(" Total Age "+ totalAge);
    }
    public void printSum(){
        System.out.println(" Name "+ getName()+" Breed "+getBreed()+" Color "+ getColor()+" Weight "+getWeight()+" Age "+getAge());
    }
    public void resetValue(int age, String breed, String color, String name, int weight){
        setAge(age);
        setBreed(breed);
        setColor(color);
        setName(name);
        setWeight(weight);
    }

}


