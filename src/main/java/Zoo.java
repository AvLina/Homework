import animals.Duck;
import animals.Fish;
import animals.Swim;


public class Zoo {

    public static Swim[] createPond() {
        Swim[] swimmer = new Swim[2];
            swimmer[0] = new Duck();
            swimmer[1] = new Fish();

            return swimmer;
    }



    public static void main(String[] args) {

        Swim[] swimmer = createPond();
        for (Swim swim : swimmer) {
            swim.swim();
        }
    }
}