package AdapterDemo.ObjectAdapterDemo;

import AdapterDemo.InterfaceAdapterDemo.Duck;

public class MalldardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("MalldardDuck Quacking...");
    }

    @Override
    public void fly() {
        System.out.println("MalldardDuck Flying...");

    }

}
