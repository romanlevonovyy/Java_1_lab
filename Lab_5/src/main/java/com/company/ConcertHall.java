package com.company;



import java.util.LinkedList;
import java.util.List;

public final class ConcertHall {

    private String name;
    private String surname;
    private String address;
    private double workinghours;


    private List<Perfomance> goodList = new LinkedList<>();

    public ConcertHall(){

    }

    public ConcertHall(final String name, final String surname,
                       final String address, final double workinghours,
                       final LinkedList<Perfomance> goodList)  {

        setName(name);
        setSurname(surname);
        setAddress(address);
        setWorkinghours(workinghours);
        setGoodList(goodList);


    }

    public List<Perfomance> sortByPrice(final List<Perfomance> result) {
        result.sort((o1, o2) -> {
            if (o1.getPrice() == o2.getPrice()) {
                return 0;

            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else return 1;

        });
        return result;

    }

    public List<Perfomance> findByShowWithMucisian
            ( final PerfomanceType goodsType) {
        List<Perfomance> result = new LinkedList<>();
        goodList.stream().filter((goodList) ->
                ((goodList.getPerfomancetype() == goodsType)))
                .forEachOrdered((goodList) -> {
            result.add(goodList);

        });
        return result;

    }


    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public double getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(final double workinghours) {
        this.workinghours = workinghours;
    }
    public List<Perfomance> getGoodList() {return goodList;}

    public void setGoodList(final List<Perfomance>
                   goodList) {this.goodList = goodList;}

    public void addGoods(final Perfomance goods) { this.goodList.add(goods); }
}
