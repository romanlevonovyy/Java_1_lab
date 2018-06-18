package com.company;

public class Orchestra extends Performance {

    private int conductor;
    private int costumer;
    private int violinist;

    public Orchestra(final double price, final int employees, final int duration, final boolean isHaveMusician,
                     final int conductor, final int costumer, final int violinist, final Integer id) {
        super(price, employees, duration, isHaveMusician, PerformanceType.ORCHESTRA, id);
        setConductor(conductor);
        setCostumer(costumer);
        setViolinist(violinist);
    }

    @Override
    public final String getHeaders() {
        return super.getHeaders() + "," + "Conductor" + "," + "Costumer" + "," + "Violinist";
    }

    @Override
    public final String toCVS() {
        return super.toCVS() + "," + getConductor() + "," + getCostumer() + "," + getViolinist();
    }

    public int getConductor() {
        return conductor;
    }

    public void setConductor(final int conductor) {
        this.conductor = conductor;
    }

    public int getCostumer() {
        return costumer;
    }

    public void setCostumer(final int costumer) {
        this.costumer = costumer;
    }

    public int getViolinist() {
        return violinist;
    }

    public void setViolinist(final int violinist) {
        this.violinist = violinist;
    }

    @Override
    public final String toString() {
        return "Orchestra{" + super.toString() +
                "conductor=" + getConductor() +
                ", costumer=" + getCostumer() +
                ", violinist=" + getViolinist() +
                '}';
    }
}
