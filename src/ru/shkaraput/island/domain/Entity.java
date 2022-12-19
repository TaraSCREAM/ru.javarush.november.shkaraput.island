package ru.shkaraput.island.domain;

import ru.shkaraput.island.domain.animal.Caterpillar;
import ru.shkaraput.island.domain.animal.Duck;
import ru.shkaraput.island.domain.animal.Fox;

public enum Entity {

    PLANT(Plant.class),
    CATERPILLAR(Caterpillar.class),
    DUCK(Duck.class),
    FOX(Fox.class);

    public Class<? extends Organism> getEntityClass() {
        return entityClass;
    }

    private final Class<? extends Organism> entityClass;

    private Entity(Class<? extends Organism> entityClass) {
        this.entityClass = entityClass;
    }

}
