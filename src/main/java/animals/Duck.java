package animals;

public  class Duck extends Herbivore implements Fly, Swim, Voice, Run {

    private int satiety;

    @Override
    public int getSatiety() {
        return satiety;
    }

    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public String getVoice() {
        return "Кря-Кря";
    }

    @Override
    public void run() {

    }
}
