package Lesson7;

import java.util.Random;

public class Cat {
    private String name;
    private final Random random = new Random();
    private int fullness;

    public Cat(String name) {
        this.name = name;
        this.fullness = random.nextInt(3 + 10);
    }

    public void eat(Plate plate) {
        while (fullness > 0 & plate.getFoodCount() > 0) {
            fullness -= plate.decreaseFood(fullness);
        }
    }

    public int getFullness() {
        return fullness;
    }

    public void info() {
        System.out.println("Аппетит кота " + name + ": " + fullness);
    }
}
