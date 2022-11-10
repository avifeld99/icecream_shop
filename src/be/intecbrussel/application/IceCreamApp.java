package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {



        IceCreamSalon salon = new IceCreamSalon(new PriceList());
        Cone.Flavor[] balls = {Cone.Flavor.LEMON, Cone.Flavor.VANILLA};
        salon.orderCone(balls);
        // of
        //salon.orderCone(new Cone.Flavor[]{Cone.Flavor.LEMON, Cone.Flavor.VANILLA});


//        Magnum magnum = new Magnum(Magnum.MagnumType.BLACKCHOCOLATE);
//        Magnum magnum1 = new Magnum(Magnum.MagnumType.WHITECHOCOLATE);
//        magnum.eat();
//        System.out.println(magnum1.getType());
//
//        Cone.Flavor[] balls = {Cone.Flavor.LEMON, Cone.Flavor.BANANA};
//        Cone cone = new Cone(balls);
//        cone.eat();
//        //--------------------------------------------------------------------------------------
//        PriceList priceList = new PriceList(1.5, 1, 2.5);
//
//        //priceList.setBallPrice(1.5);
//        System.out.println(priceList.getBallPrice());
//
//        //priceList.setRocketPrice(1);
//        System.out.println(priceList.getRocketPrice());
//
//        //priceList.setMagnumStandardPrice(2.5);
//        System.out.println(priceList.getMagnumPrice(Magnum.MagnumType.WHITECHOCOLATE));
//        System.out.println(priceList.getMagnumPrice(Magnum.MagnumType.ALPINENUTS));
//        System.out.println(priceList.getMagnumPrice(Magnum.MagnumType.ROMANTICSTRAWBERRIES));
//        //--------------------------------------------------------------------------------------
//
//        Cone.Flavor[] flavor1 = {Cone.Flavor.VANILLA, Cone.Flavor.CHOCOLATE, Cone.Flavor.PISTACHE};
//        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
//        //System.out.println(iceCreamSalon.orderCone(flavor1));
//        iceCreamSalon.orderIceRocket().eat();
//        iceCreamSalon.orderCone(flavor1);
//        System.out.println(iceCreamSalon.getProfit());
    }
}

