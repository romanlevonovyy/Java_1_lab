package com.company;

import java.util.List;

public class Main {

    public static void printList(List<Performance> List) {
        System.out.println(List);
    }


    public static void main(String[] args) {

        ConcertHall musician = new ConcertHall();

        musician.addGoods(new Orchestra(20, 30, 40, true, 3, 5, 10));
        musician.addGoods(new CircusShow(14, 36, 90, true, "Ben", "american", 22, 3));
        musician.addGoods(new RockConcert(50, 8, 70, true, 5, 4, 8));
        printList(musician.getGoodList());
        printList(musician.sortByPrice(musician.getGoodList()));
        List<Performance> result = musician.findByShowWithMucisian(PerfomanceType.ORCHESTRA);
        printList(result);


    }
}




