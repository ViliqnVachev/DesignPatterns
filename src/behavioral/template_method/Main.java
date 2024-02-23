package behavioral.template_method;

public class Main {
    public static void main(String[] args) {
        BaseGameLoader fifa = new FifaLoader();

        fifa.load();

        System.out.println("==========");

        BaseGameLoader cs = new CSLoader();

        cs.load();

    }
}
