package com.company;

public class Performance {

    private double price;
    private int employees;
    private int duration;
    private boolean isHaveMusician;
    private PerformanceType performanceType;

    private Integer id;

    public Performance() {
    }

    public Performance(final double price, final int employees, final int duration, final boolean isHaveMusician,
                       final PerformanceType performanceType, final Integer id) {
        setPrice(price);
        setEmployees(employees);
        setDuration(duration);
        setHaveMusician(isHaveMusician);
        setPerformanceType(performanceType);
        setId(id);
    }

    public String getHeaders() {
        return "Price" + "," + "Employees" + "," + "Duration" + "," + "Is Have Musician" + "," + "Performance type";
    }

    public String toCVS() {
        return getPrice() + "," + getEmployees() + "," + getDuration() + "," + isHaveMusician() + "," + getPerformanceType();
    }

    public final Integer getId() {
        return id;
    }

    public final void setId(final Integer id) {
        this.id = id;
    }

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

    public final boolean isHaveMusician() {
        return isHaveMusician;
    }

    public final void setHaveMusician(final boolean haveMusician) {
        isHaveMusician = haveMusician;
    }

    public final PerformanceType getPerformanceType() {
        return performanceType;
    }

    public final void setPerformanceType(final PerformanceType performanceType) {
        this.performanceType = performanceType;
    }

    @Override
    public String toString() {
        return "price=" + getPrice() +
                ", employees=" + getEmployees() +
                ", duration=" + getDuration() +
                ", isHaveMusician=" + isHaveMusician() +
                ", performanceType=" + getPerformanceType();
    }
}
