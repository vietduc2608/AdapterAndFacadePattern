package AdapterDemo.ObjectAdapterDemo;

import AdapterDemo.InterfaceAdapterDemo.Turkey;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("WildTurkey Gobble...");

    }

    @Override
    public void fly() {
        System.out.println("WildTurkey Fly...");

    }

}
