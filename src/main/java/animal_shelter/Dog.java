package animal_shelter;

public class Dog extends Animal {
    private String type;
    private String name;

    public Dog(String name) {
        this.name = name;
        this.type = "Dog";
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        return (other instanceof Dog) && ((Dog) other).getType().equals(this.type)
                && ((Dog) other).getName().equals(this.name);
    }
}
