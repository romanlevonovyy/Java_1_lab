package com.company;

public class Orchestra extends Perfomance {

    private int conductor;
    private int costumer;
    private int violonist;

    private final PerfomanceType perfomancetype = PerfomanceType.ORCHESTRA;

    public Orchestra(double price, int employees, int duration, boolean ishavemusician, int conductor, int costumer, int violonist) {


      //  this.price = price;
      //  this.employees = employees;
      //  this.duration = duration;
      //  this.IsHaveMusician = ishavemusician;
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
    @Override
    public String toString() {
        return "Conductor" + this.getConductor() + "Costumer" + this.getCostumer() + "Violonist" + this.getViolonist();
    }
}
