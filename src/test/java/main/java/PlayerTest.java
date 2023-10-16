package main.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerStrategyTest {

    @Test
    void PlayerNameNotNull() {
        //given
        Player player = new Player("Игрок");
        //when
        //then
        Assertions.assertNotNull(player.getName("Игрок"));

    }
    @Test
    void RiskTrue() {
        //given
        boolean risk = true;
        //when
        //then
        Assertions.assertTrue(risk);


    }
    @Test
    void NegativeRiskFalse() {
        //given
        boolean risk = false;
        //when
        //then
        Assertions.assertTrue(risk, "Alarm message");

    }


}

