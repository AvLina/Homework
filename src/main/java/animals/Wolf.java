package animals;

public class Wolf extends Carnivorous implements Run, Voice {


    @Override
    public void run() {
        System.out.println("Волк быстро бегает");
    }

    @Override
    public String getVoice() {
        return "Ау-у-у-у";
    }
}


