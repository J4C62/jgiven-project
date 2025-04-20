package com.github.j4c62.omelette;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

public class GivenStage extends Stage<GivenStage> {
  @ProvidedScenarioState
  private int eggs;
  @ProvidedScenarioState
  private boolean hasSalt;

  public GivenStage I_have_eggs(int count) {
    this.eggs = count;
    return self();
  }

  public GivenStage I_have_salt() {
    this.hasSalt = true;
    return self();
  }
}
