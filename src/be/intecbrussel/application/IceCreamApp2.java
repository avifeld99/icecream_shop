package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamApp2 {
    public static void main(String[] args) {

        Stock newStock = new Stock();
        newStock.setCones(10);
        newStock.setBalls(10);
        newStock.setIceRockets(10);

        IceCreamCar iceCreamCar = new IceCreamCar(new PriceList(), newStock);
        iceCreamCar.getProfit();
        iceCreamCar.orderCone(new Cone.Flavor[] {Cone.Flavor.MOKKA, Cone.Flavor.CHOCOLATE});
        System.out.println(newStock.getBalls());

    }
}
