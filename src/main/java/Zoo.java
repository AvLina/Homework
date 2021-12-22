import animals.*;
import employee.Worker;
import food.Grass;
import food.Meat;
import model.Size;


public class Zoo {


    public static Swim[] createPond() {
        Swim[] swimmer = new Swim[2];
        swimmer[0] = new Duck();
        swimmer[1] = new Fish();

        return swimmer;
    }

    public static void main(String[] args) {

        Duck duck = new Duck();
        Elephant elephant = new Elephant();
        Fish fish = new Fish();
        Kotik kotik = new Kotik();
        Rabbit rabbit = new Rabbit();
        Wolf wolf = new Wolf();
        Grass grass = new Grass();
        Meat meat = new Meat();
        Worker worker = new Worker();


        Swim[] swimmer = createPond();
        for (Swim swim : swimmer) {
            swim.swim();
        }
    }

    public void carnivorousAviary(Size MEDIUM) {

    }

    public void herbivoreAviary(Size LARGE) {

    }

    private static void fillCarnivorousAviary() {

    }

    private static void fillHerbivoreAviary() {
        Duck duck = new Duck();
        Elephant elephant = new Elephant();


    }

//    private static getCarnivorous(String name) {
//        return;
//    }
//
//    private static getHerbivore(String name) {
//        return;
//    }
}