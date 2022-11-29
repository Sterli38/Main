package Lesson6.Models;

import Lesson6.Configuration.ApplicationSettings;

public class Berry extends Immovable implements Eatable {

    public Berry(Coordinate coordinate, int id ) {
        super(coordinate, id);
    }

    @Override
    public int getFoodLevelIncrease() {
        return ApplicationSettings.BERRY_FOOD_LEVEL_INCREASING;
    }
}
