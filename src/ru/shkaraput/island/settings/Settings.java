package ru.shkaraput.island.settings;

import ru.shkaraput.island.domain.Entity;

import java.util.Date;
import java.util.Map;

import static ru.shkaraput.island.domain.Entity.*;

public class Settings {
    //island size
    public static final int ISLAND_WIDTH = 100;
    public static final int ISLAND_HEIGHT = 20;

    //Hunt probabilities
    public static final Map<Entity, Integer> DUCK_HUNT = Map.ofEntries(
            Map.entry(CATERPILLAR, 90),
            Map.entry(PLANT, 100)
    );
    public static final Map<Entity, Integer> FOX_HUNT = Map.ofEntries(
            Map.entry(CATERPILLAR, 40),
            Map.entry(DUCK, 60)
    );
    public static final Map<Entity, Integer> CATERPILLAR_HUNT = Map.ofEntries(
            Map.entry(PLANT, 100)
    );
    public static final Map<Entity, Integer> PLANT_HUNT = Map.ofEntries(
    );

    //Entity parameters
    public static final Map<Entity, Double> WEIGHT = Map.ofEntries(
            Map.entry(CATERPILLAR, 0.01),
            Map.entry(PLANT, 1d),
            Map.entry(FOX, 8d),
            Map.entry(DUCK, 1d)
    );
    public static final Map<Entity, Integer> MAX_IN_LOCATION = Map.ofEntries(
            Map.entry(CATERPILLAR, 1000),
            Map.entry(PLANT, 200),
            Map.entry(FOX, 30),
            Map.entry(DUCK, 200)
    );
    public static final Map<Entity, Integer> SPEED = Map.ofEntries(
            Map.entry(CATERPILLAR, 0),
            Map.entry(PLANT, 0),
            Map.entry(FOX, 2),
            Map.entry(DUCK, 4)
    );
    public static final Map<Entity, Double> HUNGER = Map.ofEntries(
            Map.entry(CATERPILLAR, 0d),
            Map.entry(PLANT, 0d),
            Map.entry(FOX, 2d),
            Map.entry(DUCK, 0.15d)
    );
}
