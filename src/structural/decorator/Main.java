package structural.decorator;

public class Main {
    public static void main(String[] args) {
        IIceCream basicIceCream = new BasicIceCream();

        IIceCream vanilla = new VanillaIceCream(basicIceCream);
        System.out.println(vanilla.cost());

        IIceCream chocolate = new ChocolateIceCream(vanilla);
        System.out.println(chocolate.cost());

        IIceCream mint = new MintIceCream(chocolate);
        System.out.println(mint.cost());
    }
}
