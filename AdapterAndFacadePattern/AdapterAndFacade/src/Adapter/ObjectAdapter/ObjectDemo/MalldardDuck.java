package Adapter.ObjectAdapter.ObjectDemo;

import Adapter.InterfaceAdapter.InterfaceDemo.Duck;

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
