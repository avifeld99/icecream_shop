package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar() {
    }

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        // check cone stock, check balls stock
        if (stock.getCones() > 0 && stock.getBalls() >= flavors.length) {
            // update stock
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavors.length);
            return new Cone();
        } else {
            new NoMoreIceCreamException();
        }

        // return new cone if order is possible
        return new Cone();
    }

    private Cone prepareCone(Cone.Flavor[] flavors) {
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        if (stock.getIceRockets() > 0) {
            stock.setIceRockets(stock.getIceRockets() - 1);
            return new IceRocket();
        } else {
            new NoMoreIceCreamException();
        }
        return new IceRocket();
    }

    private IceRocket prepareRocket() {
        if (stock.getIceRockets() > 0) {
            return new IceRocket();
        }
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        return null;
    }

    private Magnum prepareMagnum(Magnum.MagnumType type) {
        return null;
    }

    @Override
    public double getProfit() {
        return 0;
    }
}
