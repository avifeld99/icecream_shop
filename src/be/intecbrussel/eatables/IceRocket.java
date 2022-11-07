package be.intecbrussel.eatables;

public class IceRocket implements Eatable {

    public IceRocket() {
    }

    @Override
    public void eat() {
        System.out.println("you're eating an IceRocket, bon appetit!");
    }
}
