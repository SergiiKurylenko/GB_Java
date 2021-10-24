package Lesson6;

public class Cat extends Animal{
    private int limitDistanceRun;

    public Cat(String name, int limitDistanceRun) {
        super(name);
        this.limitDistanceRun = limitDistanceRun;
    }

    @Override
    public void Info() {
        System.out.println("Кот имя: " + super.getName());
    }

    @Override
    public void run(int distance) {
        if (distance <= limitDistanceRun) {
            System.out.println(super.getName() + " пробежал " + distance + " м");
        }else {
            System.out.println(super.getName() + " не смог пробежать " + distance + " м");
        }
    }

}
