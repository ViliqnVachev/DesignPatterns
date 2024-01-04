package creational.singlelton;

public class Main {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingletonSecond = LazySingleton.getInstance();

        System.out.println(lazySingleton);
        System.out.println(lazySingletonSecond);

        EagerSingleton eagerSingleton= EagerSingleton.getInstance();
        EagerSingleton eagerSingletonSecond= EagerSingleton.getInstance();

        System.out.println(eagerSingleton);
        System.out.println(eagerSingletonSecond);

        BillPughSingleton billPughSingleton= BillPughSingleton.getInstance();
        BillPughSingleton billPughSingletonSecond= BillPughSingleton.getInstance();

        System.out.println(billPughSingleton);
        System.out.println(billPughSingletonSecond);

    }
}
