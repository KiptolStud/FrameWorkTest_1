package main.java;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Parameterized.class)
class PlayGameTest {
    private final int max_g;
    private final int statisticWin;
    private final int luse_game;

    public PlayGameTest(int step, int statisticWin, int luse_game){
        this.max_g = max_g;
        this.statisticWin = statisticWin;
        this.luse_game = luse_game;
    }
    @Parameterized.Parameters
    public  static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                [1000,false,200],
                [1000,true,false],
                [1000,false,false]
        });
    }
    @Test
    void MontyTest() {
        statisticWin
        Assert.assertSame();
    }
}