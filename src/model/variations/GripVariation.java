package model.variations;

/**
 * Represents variations one can perform an exercise. <br>
 *   Wide-grip means performing the exercise
 * with a wide grip - can be applied to pull-ups, push-ups, bench press, rows, etc to target
 * different muscle groups. Similar for medium-grip and close-grip. <br>
 *   Incline means performing
 * the exercise on an inclined surface - can be applied to bench press, dumbbell press, push-ups,
 * etc. Similar for flat and decline. <br>
 *   Standing and seated variations are performing an exercise
 * either standing or seated - can be applied to shoulder press, dumbbell press, tricep extension,
 * curls, etc. <br>
 *   Supine means performing an exercise with torso facing up, and prone means torso facing down.
 */
public enum GripVariation {
  WIDE_GRIP, MED_GRIP, CLOSE_GRIP;
}
