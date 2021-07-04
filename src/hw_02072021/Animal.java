package hw_02072021;

public class Animal {
    String name;
    static int numberOfAnimals = 0;

    public Animal(String name) {
        this.name = name;
        numberOfAnimals++;
    }

    public void toSwim(int length) {
        System.out.println(name + " has already swum " + length + " meters");
    }

    public void toRun(int length) {
        System.out.println(name + " has already run " + length + " meters");
    }
}
