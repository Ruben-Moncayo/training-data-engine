package model;

import java.util.ArrayList;
import java.util.List;

public class ExerciseLog {

    private String exerciseName;
    private List<SetEntry> sets;

    public ExerciseLog(String exerciseName) {
        this.exerciseName = exerciseName;
        this.sets = new ArrayList<>();
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void addSet(int reps, double weight) {
        sets.add(new SetEntry(reps, weight));
    }

    public double getTotalVolume() {
        double total = 0;
        for (SetEntry set : sets) {
            total += set.getVolume();
        }
        return total;
    }

    public List<SetEntry> getSets() {
        return sets;
    }
}
