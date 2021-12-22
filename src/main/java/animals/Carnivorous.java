package animals;

import food.Food;
import food.Meat;
import model.Size;

public class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);
    }

    public Carnivorous() {

    }


    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            int satiety = getSatiety();
            int energy = food.getEnergy();
            setSatiety(satiety + energy);
            System.out.println("Сытость: " + getSatiety());
        } else {
            System.out.println("Хищники не едят траву");
        }

    }

    @Override
    public Size getSize() {
        return null;
    }
}
