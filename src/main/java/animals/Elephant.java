package animals;

public abstract class Elephant extends Herbivore implements Run, Voice {

    @Override
    public void run() {
        System.out.println("Слон бегает");
    }

    @Override
    public String getVoice() {
        return "Слон трубит";
    }
}

