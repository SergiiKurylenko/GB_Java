package Lesson6;

public class Animal {
    private String name;

    private static int countAnimal;

    public void run(int distance){

    }
    public void swim(int distance){

    }

    public Animal(String name) {
        this.name = name;
        countAnimal ++;
    }

    public void Info() {
        System.out.println("Имя: " + name);
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public String getName() {
        return name;
    }
}
