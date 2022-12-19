package ru.shkaraput.island.util;

import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {
    public static int getInt(int bound) {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return random.nextInt(bound);
    }
}
