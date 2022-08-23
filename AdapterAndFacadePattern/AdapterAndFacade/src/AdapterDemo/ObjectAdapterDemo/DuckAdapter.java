package AdapterDemo.ObjectAdapterDemo;

import java.util.Random;

import AdapterDemo.InterfaceAdapterDemo.Duck;
import AdapterDemo.InterfaceAdapterDemo.Turkey;

public class DuckAdapter implements Turkey {
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }

    }

}
