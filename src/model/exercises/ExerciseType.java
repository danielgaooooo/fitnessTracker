package model.exercises;

/**
 * Represents different categories of exercises.<br> Abs represents all exercises that mainly target
 * the abdominals. Hip flexors, upper/lower abdominals, and the obliques are represented here. <br>
 * Back represents all exercises that mainly target the back, including the lats, traps, lower back,
 * teres major/minor, and rhomboids. <br> Bicep represents all exercises that mainly target the
 * biceps, with distinction between the long (outside) head and short (inside) head. The brachialis
 * (hammer curls) is classified here as well. <br> Tricep represents all exercises that mainly
 * target the triceps, with distinction between the lateral, medial, and long heads.<br> Chest
 * represents all exercises that mainly target the pectorals, with distinction between the upper,
 * middle, and lower chest. <br> Legs represents all exercises that mainly target the leg muscles.
 * These include the quadriceps, hamstrings, hip abductors/adductors, gluteous maximus/minimus, and
 * calves (gastrocnemius, outer, and soleus, inner). <br> Shoulder represents all exercises that
 * mainly target the shoulders, with distinction between the anterior, lateral, and posterior heads,
 * and the rotator cuff.
 */
public enum ExerciseType {
  ABS, BACK, BICEP, TRICEP, CHEST, LEGS, SHOULDER;
}
