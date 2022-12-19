package ru.shkaraput.island.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Island {

    private List<List<Location>> islandField;

    public void islandInit(int width, int height) {
        if (width < 1 || height < 1) {
            throw new IllegalArgumentException("The island's width or height can't be less than 1");
        }
        islandField = new ArrayList<>();
        for (int i = 0; i < width; i++) {
            islandField.add(new ArrayList<>());
            for (int j = 0; j < height; j++) {
                islandField.get(i).add(new Location());
            }
        }
    }
}
