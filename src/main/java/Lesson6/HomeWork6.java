package Lesson6;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 200);
        Cat cat2 = new Cat("Мурзик", 200);
        Cat cat3 = new Cat("Том", 200);
        Dog dog1 = new Dog("Бобик", 500, 10);
        Dog dog2 = new Dog("Тузик", 500, 10);
        Dog dog3 = new Dog("Шарик", 500, 10);

        cat1.run(150);
        cat2.run(200);
        cat1.run(250);
        dog1.run(250);
        dog2.run(500);
        dog3.run(550);
        dog3.swim(10);
        dog2.swim(15);
        cat1.Info();
        dog1.Info();
        System.out.println("Количество животных: " + Animal.getCountAnimal());
    }
}
