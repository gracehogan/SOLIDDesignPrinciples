package birds;

public class BirdApp {

    public static void main(String[] args) {
        Bird hawk = new Hawk();
        hawk.eat();
        hawk.fly();

        Bird ostrich = new Ostrich();
        ostrich.eat();
        ostrich.fly();
    }
}
