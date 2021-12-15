package animals;

public  class Duck extends Herbivore implements Fly, Swim, Voice {

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
}
