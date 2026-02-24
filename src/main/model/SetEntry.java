package model;

public class SetEntry {
    private int reps;
    private double weight;

    public SetEntry(int reps, double weight) {
        this.reps = reps;
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public double getWeight() {
        return weight;
    }

    public double getVolume() {
        return reps * weight;
    }
}
