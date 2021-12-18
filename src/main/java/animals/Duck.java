package animals;

public class Duck extends Herbivore implements Fly, Swim, Voice, Run {

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
        System.out.println("Утка бегает");
    }
}
