package animals;

import food.Food;
import food.Grass;
import food.WrongFoodException;
import model.Size;

public abstract class Herbivore extends Animal {

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore() {
    }

    public void eat(Food food) {
        if (food instanceof Grass) {
            int satiety = getSatiety();
            int energy = food.getEnergy();
            setSatiety(satiety + energy);
            System.out.println("Сытость: " + getSatiety());
        } else {
            System.out.println("Травоядные не едят мясо");
        }
        try {
            throw new WrongFoodException ("Я такое не ем");
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Size getSize() {
        return null;
    }
}
