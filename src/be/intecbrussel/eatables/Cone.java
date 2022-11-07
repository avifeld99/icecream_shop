package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable {

    private Flavor[] balls;

    public Cone() {
    }

    public Cone(Flavor[] balls) {
        for (int index = 0; index < Flavor.values().length; index++) {
            balls[index] = Flavor.CHOCOLATE;
        }
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println(Arrays.toString(balls));
    }

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;
    }
}
