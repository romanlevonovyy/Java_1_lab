package com.company;

import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void printList(final List<Perfomance> list) {
        System.out.println(list);
    }


    public static void main(final String[] args) {

        ConcertHall musician = new ConcertHall();

        musician.addGoods(new Orchestra(20, 30, 40, true, 3, 5, 10));
        musician.addGoods(new CircusShow(14, 36, 90, true, "Ben", "american", 22, 3));
        musician.addGoods(new RockConcert(50, 8, 70, true, 5, 4, 8));


//printList(ConcertHall.getGoodList());

        Scanner in = new Scanner(System.in);
        int b=0;

        System.out.println("MENU:\n 1.getGoodList:\n "
              + "2.sortByPrice:\n 3.findByShowWithMusician:");
        b = in.nextInt();
        while (b!= 4) {

            switch (b) {
                case 1:
                    printList(musician.getGoodList());
                    break;
                case 2:
                    printList(musician.sortByPrice(musician.getGoodList()));
                    break;
                case 3:
                    List<Perfomance> result = musician.findByShowWithMucisian(
                            PerfomanceType.ORCHESTRA);
                    printList(result);
                    break;

            }
            System.out.println("MENU:\n 1.getGoodList:\n "
                   + "2.sortByPrice:\n 3.findByShowWithMusician:");
            b = in.nextInt();
        }





        //       printList(musician.getGoodList());
        //       System.out.println("     ");
        //       List<Performance> result = musician.
        // findByShowWithMucisian(PerfomanceType.ORCHESTRA);
        //       printList(result);
        //       printList(musician.sortByPrice(musician.getGoodList()));
        //       System.out.println("     ");


    }
}
