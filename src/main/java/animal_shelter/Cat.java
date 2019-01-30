package animal_shelter;

public class Cat extends Animal {
    private String type;
    private String name;

    public Cat(String name) {
        this.name = name;
        this.type = "Cat";
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        return (other instanceof Cat) && ((Cat) other).getType().equals(this.type)
                && ((Cat) other).getName().equals(this.name);
    }
}
