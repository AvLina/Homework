package animals;

public abstract class Fox extends Carnivorous implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Лиса бегает");
    }

    @Override
    public String getVoice() {
        return "Кау-Кау";
    }
}
