// The Blueprint (Class)
class Dog {
    String breed;
    int age;

    void bark() {
        System.out.println("Woof! I am a " + breed);
    }
}

public class main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.breed = "Golden Retriever";
        dog1.age = 3;

        Dog dog2 = new Dog();
        dog2.breed = "Beagle";
        dog2.age = 5;

        System.out.println("Dog 1 info:");
        dog1.bark();

        System.out.println("\nDog 2 info:");
        dog2.bark();

        System.out.println("\nAre they the same object? " + (dog1 == dog2));
    }
}