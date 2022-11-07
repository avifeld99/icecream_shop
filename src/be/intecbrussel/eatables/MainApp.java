package be.intecbrussel.eatables;

public class MainApp {
    public static void main(String[] args) {

        Magnum magnum = new Magnum(Magnum.MagnumType.BLACKCHOCOLATE);
        Magnum magnum1 = new Magnum(Magnum.MagnumType.WHITECHOCOLATE);
        magnum.eat();
        System.out.println(magnum1.getType());

        Cone cone = new Cone(Cone.Flavor.values());
        cone.eat();

    }
}
