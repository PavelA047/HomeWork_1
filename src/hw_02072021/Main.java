package hw_02072021;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        Dog dog = new Dog("Zag");
        cat.toRun(201);
        dog.toRun(501);
        cat.toSwim(1);
        dog.toSwim(11);
        System.out.println("Number of created animals: " + Animal.numberOfAnimals);
        System.out.println("Number of created cats: " + Cat.numberOfCats);
        System.out.println("Number of created dogs: " + Dog.numberOfDogs);
    }
}
