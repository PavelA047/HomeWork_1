package hw_06072021;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    public boolean decreaseFood(int amount, String name) {
        if (food >= amount) {
            food -= amount;
            return true;
        } else {
            System.out.print(name + "у не не хватило: " + (amount - food) + ". ");
            food = 0;
            return false;
        }
    }

    public void increaseFood(int amount) {
        food += amount;
    }
}
