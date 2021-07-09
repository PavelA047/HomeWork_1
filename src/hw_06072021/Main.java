package hw_06072021;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = {
                new Cat("Коржик", 40),
                new Cat("Мурзик", 20),
                new Cat("Барсик", 60),
                new Cat("Компот", 10),
                new Cat("Мусик", 30),
        };
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        System.out.println(plate);
        plate.increaseFood(1000);
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        System.out.println(plate);
    }
}