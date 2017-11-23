package model.muscles;

import java.util.ArrayList;

public abstract class AMuscle implements Muscle {

  @Override
  public abstract String getName();

  @Override
  public abstract ArrayList<String> getHeads();
}
