package com.company;

public class RockConcert extends Performance {

    private int guitarist;
    private int pianist;
    private int drummer;

    public RockConcert(final double price, final int employees, final int duration, final boolean isHaveMusician,
                       final int guitarist, final int pianist, final int drummer, final Integer id) {
        super(price, employees, duration, isHaveMusician, PerformanceType.ROCKCONCERT, id);
        setGuitarist(guitarist);
        setPianist(pianist);
        setDrummer(drummer);
    }

    @Override
    public final String getHeaders() {
        return super.getHeaders() + "," + "Guitarist" + "," + "Pianist" + "," + "Drummer";
    }

    @Override
    public final String toCVS() {
        return super.toCVS() + "," + getGuitarist() + "," + getPianist() + "," + getDrummer();
    }

    public final int getGuitarist() {
        return guitarist;
    }

    public final void setGuitarist(final int guitarist) {
        this.guitarist = guitarist;
    }

    public final int getPianist() {
        return pianist;
    }

    public final void setPianist(final int pianist) {
        this.pianist = pianist;
    }

    public final int getDrummer() {
        return drummer;
    }

    public final void setDrummer(final int drummer) {
        this.drummer = drummer;
    }

    @Override
    public String toString() {
        return "RockConcert{" + super.toString() +
                "guitarist = " + getGuitarist() +
                ", pianist = " + getPianist() +
                ", drummer = " + getDrummer() +
                '}';
    }
}