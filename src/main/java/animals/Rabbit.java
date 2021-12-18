package animals;

public class Rabbit extends Herbivore implements Run {

    private int satiety;

    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void run() {
        System.out.println("Кролик бегает");
    }
}
