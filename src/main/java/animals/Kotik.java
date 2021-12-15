package animals;

public abstract class Kotik extends Herbivore implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Котик быстро бегает");
    }

    @Override
    public String getVoice() {
        return "Мяу";
    }
}
