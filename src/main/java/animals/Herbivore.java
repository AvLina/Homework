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

    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            int satiety = getSatiety();
            int energy = food.getEnergy();
            setSatiety(satiety + energy);
            System.out.println("Сытость: " + getSatiety());
        } else {
            throw new WrongFoodException("Травоядные не едят мясо");
        }
    }

    @Override
    public Size getSize() {
        return null;
    }
}
