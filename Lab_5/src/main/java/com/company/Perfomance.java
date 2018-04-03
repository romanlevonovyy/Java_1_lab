package com.company;


public abstract class Perfomance  {


    private double price;
    private int employees;
    private int duration;
    private boolean ishavemusician;


    public abstract PerfomanceType getPerfomancetype();

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final int getEmployees() {
        return employees;
    }

    public final void setEmployees(final int employees) {
        this.employees = employees;
    }

    public final int getDuration() {
        return duration;
    }

    public final void setDuration(final int duration) {
        this.duration = duration;
    }

    public final boolean ishavemusician() {
        return ishavemusician;
    }

    public final void setHaveMusician(final boolean haveMusician) {
        ishavemusician = haveMusician;
    }

}
