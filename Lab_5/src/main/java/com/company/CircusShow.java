package com.company;

public class CircusShow extends Perfomance {

    private String director;
    private String acrobats;
    private int participans;
    private int lions;

    private final PerfomanceType perfomancetype = PerfomanceType.CIRCUSSHOW;
    public CircusShow(final double price, final int employees,
                      final int duration,
                      final boolean ishavemusician, final String director,
                      final String acrobats, final int participans,
                      final int lions) {
//        this.price = price;
//        this.employees = employees;
//        this.duration = duration;
//        this.IsHaveMusician = IsHaveMusician;
        this.director = director;
        this.acrobats = acrobats;
        this.participans = participans;
        this.lions = lions;

    }

    public final String getDirector() {
        return director;
    }

    public final void setDirector(final String director) {
        this.director = director;
    }

    public final String getAcrobats() {
        return acrobats;
    }

    public final void setAcrobats(final String acrobats) {
        this.acrobats = acrobats;
    }

    public final int getParticipans() {
        return participans;
    }

    public final void setParticipans(final int participans) {
        this.participans = participans;
    }

    public final int getLions() {
        return lions;
    }

    public final void setLions(final int lions) {
        this.lions = lions;
    }

    public final PerfomanceType getPerfomancetype() {
        return perfomancetype;
    }
    @Override
    public String toString() {
        return "Director" + this.getDirector() + "Acrobats" + this.getAcrobats()
                + "Participans" + this.getParticipans()
                + "Lions" + this.getLions();
    }

}
