package Lesson7;

public class Plate {
    private int foodCount;

    public Plate() {
    }

    public void printInfo() {
        System.out.println("Кол-во еды в миске: " + foodCount);
    }

    public int decreaseFood(int catEatFoodCount) {
        int food = catEatFoodCount <= foodCount ? catEatFoodCount: foodCount;
        foodCount -= food;
        return food;
    }

    public void increaseFood() {
        foodCount = 20;
        System.out.println("Миска наполнена на " + foodCount);
    }

    public int getFoodCount() {
        return foodCount;
    }
}

