package animals;

public class Rabbit extends Herbivore implements Run {

    private int satiety;

    public Rabbit(String name) {
        super(name);
    }

    public Rabbit() {
        super();
    }

    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void run() {
        System.out.println("Кролик бегает");
    }
}

