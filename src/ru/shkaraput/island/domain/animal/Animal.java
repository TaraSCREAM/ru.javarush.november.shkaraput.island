package ru.shkaraput.island.domain.animal;

import ru.shkaraput.island.domain.Organism;

public abstract class Animal extends Organism {

    abstract void breed();

    abstract void chooseDirection();

    abstract void die();
}
