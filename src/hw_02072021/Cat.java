package hw_02072021;

public class Cat extends Animal {
    static int numberOfCats = 0;

    public Cat(String name) {
        super(name);
        numberOfCats++;
    }

    @Override
    public void toRun(int length) {
        if (length > 200) {
            System.out.println("Cat can't run more then 200 meters");
        } else {
            System.out.println(name + " has already run " + length + " meters");
        }
    }

    @Override
    public void toSwim(int length) {
        if (length > 0) {
            System.out.println("Cat can't swim");
        } else {
            System.out.println("Ok, because he can't swim at all");
        }
    }
}
