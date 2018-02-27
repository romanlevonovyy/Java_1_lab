package com.company;


public abstract class Performance {


    public double price;
    public int employees;
    public int duration;
    public boolean IsHaveMusician;


    public abstract PerfomanceType getPerfomancetype();



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isHaveMusician() {
        return IsHaveMusician;
    }

    public void setHaveMusician(boolean haveMusician) {
        IsHaveMusician = haveMusician;
    }

    @Override
    public String toString() {
        return "Price"+this.getPrice()+"Durationo"+this.getDuration()+"Employees"+this.getEmployees();
    }
}
