package Lesson7;

public class HomeWork7 {
    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Барсик");
        cats[1] = new Cat("Мурзик");
        cats[2] = new Cat("Том");
        Plate plate = new Plate();

        plate.increaseFood();
        plate.printInfo();


        for (Cat cat: cats) {
            while (plate.getFoodCount() > 0 & cat.getFullness() > 0) {
                System.out.println("Перед едой");
                cat.info();
                cat.eat(plate);
                System.out.println("После еды");
                plate.printInfo();
                cat.info();
                Thread.sleep(3000);
            }
        }

    }
}
