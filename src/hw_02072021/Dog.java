package hw_02072021;

public class Dog extends Animal {
    static int numberOfDogs = 0;

    public Dog(String name) {
        super(name);
        numberOfDogs++;
    }

    @Override
    public void toRun(int length) {
        if (length > 500) {
            System.out.println("Dog can't run more then 500 meters");
        } else {
            System.out.println(name + " has already run " + length + " meters");
        }
    }

    @Override
    public void toSwim(int length) {
        if (length > 10) {
            System.out.println("Dog can't swim more then 500 meters");
        } else {
            System.out.println(name + " has already swum " + length + " meters");
        }
    }
}
