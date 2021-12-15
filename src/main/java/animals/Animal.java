package animals;
import food.Food;
public abstract class Animal {

   private int satiety;

   public void setSatiety(int satiety) {
      this.satiety = satiety;
   }

   public int getSatiety() {
      return satiety;
   }

   public abstract void eat (Food food);




}
