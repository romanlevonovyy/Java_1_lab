package com.company;

public class Orchestra extends Performance {

    private int conductor;
    private int costumer;
    private int violonist;

    private final PerfomanceType perfomancetype = PerfomanceType.ORCHESTRA;

    public Orchestra(double price, int employees, int duration, boolean IsHaveMusician, int conductor, int costumer, int violonist) {

        this.price = price;
        this.employees = employees;
        this.duration = duration;
        this.IsHaveMusician = IsHaveMusician;
        this.conductor = conductor;
        this.costumer = costumer;
        this.violonist = violonist;

    }

    public int getConductor() {
        return conductor;
    }

    public void setConductor(int conductor) {
        this.conductor = conductor;
    }

    public int getCostumer() {
        return costumer;
    }

    public void setCostumer(int costumer) {
        this.costumer = costumer;
    }

    public int getViolonist() {
        return violonist;
    }

    public void setViolonist(int violonist) {
        this.violonist = violonist;
    }

    public PerfomanceType getPerfomancetype() {
        return perfomancetype;
    }
}
