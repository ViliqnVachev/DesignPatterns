package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PeperoniPizza());
        americanRestaurant.delivery();

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.delivery();
    }
}
