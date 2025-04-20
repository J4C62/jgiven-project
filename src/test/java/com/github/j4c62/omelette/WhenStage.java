package com.github.j4c62.omelette;


import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

public class WhenStage extends Stage<WhenStage> {
  @ProvidedScenarioState
  private boolean omelettePrepared;

  public WhenStage I_mix_the_ingredients() {
    omelettePrepared = true;
    return self();
  }
}
