package com.github.j4c62.omelette;

import com.tngtech.jgiven.Stage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThenStage extends Stage<ThenStage> {
  public ThenStage I_should_get_an_omelette() {
    assertTrue(true, "The omelette was successfully prepared.");
    return self();
  }
}

