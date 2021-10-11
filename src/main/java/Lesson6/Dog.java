package Lesson6;

public class Dog extends Animal{
    private int limitDistanceRun;
    private int limitDistanceSwim;

    public Dog(String name, int limitDistanceRun, int limitDistanceSwim) {
        super(name);
        this.limitDistanceRun = limitDistanceRun;
        this.limitDistanceSwim = limitDistanceSwim;
    }
    @Override
    public void Info() {
        System.out.println("Пёс имя: " + super.getName());
    }

    @Override
    public void run(int distance) {
        if (distance <= limitDistanceRun) {
            System.out.println(super.getName() + " пробежал " + distance + " м");
        }else {
            System.out.println(super.getName() + " не смог пробежать " + distance + " м");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance <= limitDistanceSwim) {
            System.out.println(super.getName() + " проплыл " + distance + " м");
        }else {
            System.out.println(super.getName() + " не смог проплыть " + distance + " м");
        }
    }
}
