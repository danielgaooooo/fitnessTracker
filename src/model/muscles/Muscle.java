package model.muscles;

import java.util.ArrayList;

/**
 * Represents a muscle that can be exercised. Examples include the tricep, bicep, hamstring, and the
 * pectoral.
 */
public interface Muscle {

  /**
   * Gets the name of this muscle.
   *
   * @return the name of this muscle.
   */
  String getName();

  /**
   * Gets the aspects of the muscle that can be worked (e.g. the shoulder has the medial, anterior,
   * and posterior heads).
   *
   * @return the different aspects of the muscle.
   */
  ArrayList<String> getHeads();
}
