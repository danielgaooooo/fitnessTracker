package model.exercises;

import model.muscles.Muscle;

import java.util.ArrayList;


/**
 * Represents an exercise that can be performed. Specifies the name of the exercise, the main muscle
 * target, and the secondary muscles targeted. Contains methods to return information about an
 * exercise.
 */
public interface Exercise {

  /**
   * Gets the name of this exercise.
   *
   * @return name of this exercise
   */
  String getName();

  /**
   * Gets the main muscle targeted by this exercise.
   *
   * @return main muscle targeted
   */
  Muscle getMainMuscleTarget();

  /**
   * Gets all the secondary muscles targeted by this exercise.
   *
   * @return secondary muscles targeted
   */
  ArrayList<Muscle> getSecondaryMuscleTargets();
}