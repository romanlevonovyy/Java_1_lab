package com.company;



import java.util.LinkedList;
import java.util.List;

public final class ConcertHall {

    private String name;
    private String surname;
    private String address;
    private double workinghours;



    private List<Performance> goodList = new LinkedList<>();

    public ConcertHall(){

    }

    public ConcertHall(String name, String surname, String address, double workinghours, LinkedList<Performance> goodList){

        setName(name);
        setSurname(surname);
        setAddress(address);
        setWorkinghours(workinghours);
        setGoodList(goodList);


    }

    public List<Performance> sortByPrice(List<Performance> result) {
        result.sort((o1, o2) -> {
            if (o1.getPrice() == o2.getPrice()) {
                return 0;

            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
                } else return 1;

        });
        return result;

        }

        public List<Performance> findByShowWithMucisian(PerfomanceType goodsType) {
        List<Performance> result = new LinkedList<>();
        goodList.stream().filter((goodList) -> ((goodList.getPerfomancetype() == goodsType))).forEachOrdered((goodList) -> {
            result.add(goodList);

        });
        return result;

        }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(double workinghours) {
        this.workinghours = workinghours;
    }
    public List<Performance> getGoodList() { return goodList; }

    public void setGoodList(List<Performance> goodList) {this.goodList = goodList; }

    public void addGoods(Performance goods) { this.goodList.add(goods); }
}




