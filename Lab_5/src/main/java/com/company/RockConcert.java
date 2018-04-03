package com.company;





public class RockConcert  extends Perfomance {

    private int guitarist;
    private int pianist;
    private int drummer;

    private final PerfomanceType perfomancetype = PerfomanceType.ROCKCONCERT;

    public RockConcert(final double price, final int employees,
                       final int duration, final boolean ishavemusician,
                       final int guitarist, final int pianist, final int drummer) {


      //  this.price = price;
     //   this.employees = employees;
      //  this.duration = duration;
      //  this.IsHaveMusician = ishavemusician;
        this.guitarist = guitarist;
        this.pianist = pianist;
        this.drummer = drummer;

    }

    public final int getGuitarist() {
        return guitarist;
    }

    public final void setGuitarist(int guitarist) {
        this.guitarist = guitarist;
    }

    public final int getPianist() {
        return pianist;
    }

    public final void setPianist(int pianist) {
        this.pianist = pianist;
    }

    public final int getDrummer() {
        return drummer;
    }

    public final void setDrummer(int drummer) {
        this.drummer = drummer;
    }

    public PerfomanceType getPerfomancetype() {
        return perfomancetype;
    }

    @Override
    public String toString() {
        return "Guitarist" + this.getGuitarist() + "Pianist" + this.getPianist() + "Drummer" + this.getDrummer();
    }
}