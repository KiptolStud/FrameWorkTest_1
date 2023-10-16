package main.java;

import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTest {

    static List<Door> doors;

    @BeforeAll
    void initDoors () {
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
    }
    }



