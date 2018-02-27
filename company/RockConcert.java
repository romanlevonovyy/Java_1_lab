package com.company;

public class RockConcert  extends Performance {

        private int guitarist;
        private int pianist;
        private int drummer;

    private final PerfomanceType perfomancetype = PerfomanceType.ROCKCONCERT;

    public RockConcert(double price, int employees, int duration, boolean IsHaveMusician, int guitarist, int pianist, int drummer){


        this.price = price;
        this.employees = employees;
        this.duration = duration;
        this.IsHaveMusician = IsHaveMusician;
        this.guitarist = guitarist;
        this.pianist = pianist;
        this.drummer = drummer;

    }

    public int getGuitarist() {
        return guitarist;
    }

    public void setGuitarist(int guitarist) {
        this.guitarist = guitarist;
    }

    public int getPianist() {
        return pianist;
    }

    public void setPianist(int pianist) {
        this.pianist = pianist;
    }

    public int getDrummer() {
        return drummer;
    }

    public void setDrummer(int drummer) {
        this.drummer = drummer;
    }

    public PerfomanceType getPerfomancetype() {
        return perfomancetype;
    }
}
