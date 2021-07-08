package hw_06072021;

public class Cat {
    private final String name;
    private final int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        boolean isFull = plate.decreaseFood(this.appetite, this.name);
        if (isFull) {
            System.out.println(name + " наелся.");
        } else {
            System.out.println(name + " не наелся!");
        }
    }
}
