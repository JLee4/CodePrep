import animal_shelter.Animal;
import animal_shelter.AnimalShelter;
import animal_shelter.Cat;
import animal_shelter.Dog;
import org.junit.experimental.runners.Enclosed;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Enclosed.class)
public class AnimalShelterTest {

    private AnimalShelter shelter;
    private Dog dog1;
    private Dog dog2;
    private Cat cat1;
    private Cat cat2;

    @BeforeEach
    public void before() {
        this.shelter = new AnimalShelter();
        dog1 = new Dog("Spot");
        cat1 = new Cat("Mittens");
        cat2 = new Cat("Paws");
        dog2 = new Dog("Fido");

        shelter.enqueue(dog1);
        shelter.enqueue(cat1);
        shelter.enqueue(cat2);
        shelter.enqueue(dog2);
    }

    @Test
    public void testDequeueAny() {
        Animal animal = shelter.dequeueAny();
        assertEquals(animal, dog1);
    }

    @Test
    public void testDequeueDog() {
        Animal animal = shelter.dequeueAny();
        assertEquals(animal, dog1);
    }

    @Test
    public void testDequeueCat() {
        Animal animal = shelter.dequeueAny();
        assertEquals(animal, cat1);
    }
}
