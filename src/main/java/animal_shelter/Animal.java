package animal_shelter;

public abstract class Animal {
    private String type;

    public Animal() {

    }

    public String getType() {
        return "???";
    }

    public boolean equals(Object other) {
        return (other instanceof Animal) && ((Animal) other).getType().equals(this.type);
    }
}
