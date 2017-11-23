package model.exercises;

import java.util.ArrayList;
import java.util.Objects;

import model.muscles.Muscle;
import model.setTypes.NormalSet;
import model.setTypes.SetType;

public class AExercise implements Exercise {
  ExerciseType type;
  private boolean warmUp;
  private boolean burnOut;
  private SetType setType;


  public AExercise(ExerciseType type) {
    Objects.requireNonNull(type);
    this.type = type;
    this.warmUp = true;
    this.burnOut = true;
    this.setType = new NormalSet();
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public Muscle getMainMuscleTarget() {
    return null;
  }

  @Override
  public ArrayList<Muscle> getSecondaryMuscleTargets() {
    return null;
  }
}
