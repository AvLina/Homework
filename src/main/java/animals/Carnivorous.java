package animals;

import food.Food;
import food.Meat;
import food.WrongFoodException;
import model.Size;


public abstract class Carnivorous extends Animal {

    public Carnivorous(String name) {
        super(name);
    }

    public Carnivorous() {
        super();
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
        try {
            throw new WrongFoodException("Я такое не ем");
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
    }
}
