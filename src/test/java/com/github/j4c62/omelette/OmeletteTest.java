package com.github.j4c62.omelette;

import com.tngtech.jgiven.junit5.ScenarioTest;
import org.junit.jupiter.api.Test;

class OmeletteTest extends ScenarioTest<GivenStage, WhenStage, ThenStage> {

  @Test
  void preparing_an_omelette_with_eggs_and_salt() {
    given().I_have_eggs(2).and().I_have_salt();

    when().I_mix_the_ingredients();

    then().I_should_get_an_omelette();
  }
}
