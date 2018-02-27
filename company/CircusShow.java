package com.company;

public class CircusShow extends Performance {

    private String director;
    private String acrobats;
    private int participans;
    private int lions;

    private final PerfomanceType perfomancetype = PerfomanceType.CIRCUSSHOW;

    public CircusShow(double price, int employees, int duration, boolean IsHaveMusician, String director, String acrobats, int participans, int lions){

        this.price = price;
        this.employees = employees;
        this.duration = duration;
        this.IsHaveMusician = IsHaveMusician;
        this.director = director;
        this.acrobats = acrobats;
        this.participans = participans;
        this.lions = lions;

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAcrobats() {
        return acrobats;
    }

    public void setAcrobats(String acrobats) {
        this.acrobats = acrobats;
    }

    public int getParticipans() {
        return participans;
    }

    public void setParticipans(int participans) {
        this.participans = participans;
    }

    public int getLions() {
        return lions;
    }

    public void setLions(int lions) {
        this.lions = lions;
    }

    public PerfomanceType getPerfomancetype() {
        return perfomancetype;
    }
}
