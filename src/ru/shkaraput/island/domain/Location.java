package ru.shkaraput.island.domain;

import ru.shkaraput.island.util.Randomizer;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Location {
    private Map<Entity, Set<? extends Organism>> population;
    private Map<Entity, Integer> entitiesMaximums;

    public void locationInit(Map<Entity, Integer> entitiesMaximums) {
        this.entitiesMaximums = entitiesMaximums;
        for (Map.Entry<Entity, Integer> maxInLoc : entitiesMaximums.entrySet()) {
            Entity entity = maxInLoc.getKey();
            Set<? extends Organism> tenants = fillTenantsToSet(maxInLoc);
            population.put(maxInLoc.getKey(), tenants);
        }

    }

//            TODO
//             make this method work
    private Set<? extends Organism> fillTenantsToSet(Map.Entry<Entity, Integer> maxInLoc) {
        Class entityClass = maxInLoc.getKey().getEntityClass();
        Set<? extends Organism> tenants = new HashSet<>();
        int currentCount = Randomizer.getInt(maxInLoc.getValue() + 1);
        for (int i = 0; i < currentCount; i++) {
                tenants.add(null);
        }

        return tenants;
    }
}
