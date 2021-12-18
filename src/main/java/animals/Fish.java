package animals;

public class Fish extends Carnivorous implements Swim {

    private int satiety;

    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void swim() {
        System.out.println("Акула плавает");
    }
}
