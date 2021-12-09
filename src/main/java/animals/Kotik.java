package animals;


public class Kotik {
    private String name;
    private String voice;
    private int satiety;
    private int weight;
    private static int count = 0;
    private String typeEat;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getKotikCount() {
        return count;
    }

    public void setKotikCount(int count) {
        Kotik.count = count;
    }

    public String getTypeEat() {
        return typeEat;
    }

    public void setTypeEat(String typeEat) {
        this.typeEat = typeEat;
    }

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    private boolean play() {
        if (satiety > 0) {
            System.out.println("Давай играть");
            satiety--;
        } else {
            System.out.println("Я голодный");
        }
        return true;
    }

    private boolean sleep() {
        if (satiety > 0) {
            System.out.println("Хочу спать");
            satiety--;
        } else {
            System.out.println("Я голодный");
        }
        return true;
    }

    private boolean wash() {
        if (satiety > 0) {
            System.out.println("Пошли купаться");
            satiety--;
        } else {
            System.out.println("Я голодный");
        }
        return true;
    }

    private boolean walk() {
        if (satiety > 0) {
            System.out.println("Пойдем гулять");
            satiety--;
        } else {
            System.out.println("Я голодный");
        }
        return true;
    }

    private boolean hunt() {
        if (satiety > 0) {
            System.out.println("RRRR.... I'm a tiger");
            satiety--;
        } else {
            System.out.println("Я голодный");
        }
        return true;
    }

    private static final int METHODS = 5;

    public int getMETHODS() {
        return METHODS;
    }

    public void eat(int satiety) {
        this.satiety += satiety;
    }

    public void eat(int satiety, String typeEat) {
        String s = typeEat;
        int satietyIn = satiety;
    }

    public void eat() {
        eat(satiety, typeEat);


    }

    public String[] liveAnotherDay() {
        String[] array = new String[24];
        for (int i = 0; i < 24; i++) {
            int num = (int) ((int) (Math.random() * METHODS) + 1);
            switch (num) {
                case (1):
                    if (play() == true) {
                        array[i] = (num + "- играл");
                    } else {
                        eat(num);
                        array[i] = (num + "- ел");
                    }
                    break;
                case (2):
                    if (sleep() == true) {
                        array[i] = (num + "- спал");
                    } else {
                        eat(num);
                        array[i] = (num + "- ел");
                    }
                    break;
                case (3):
                    if (wash() == true) {
                        array[i] = (num + "- умывался");
                    } else {
                        eat(num);
                        array[i] = (num + "- ел");
                    }
                    break;
                case (4):
                    if (walk() == true) {
                        array[i] = (num + "- гулял");
                    } else {
                        eat(num);
                        array[i] = (num + "- ел");
                    }
                    break;
                case (5):
                    if (hunt() == true) {
                        array[i] = (num + "- охотился");
                    } else {
                        eat(num);
                        array[i] = (num + "- ел");
                    }
                    break;
            }

        }
        return array;
    }
}
