package AdapterDemo.MainTestDriveDemo;

import AdapterDemo.InterfaceAdapterDemo.Duck;
import AdapterDemo.ObjectAdapterDemo.MalldardDuck;
import AdapterDemo.ObjectAdapterDemo.TurkeyAdapter;
import AdapterDemo.ObjectAdapterDemo.WildTurkey;

public class MainTestDrive {
    public static void main(String[] args) {
        MalldardDuck malldardDuck = new MalldardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey Says...");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("The Duck Says...");
        testDuck(malldardDuck);
        System.out.println("The TurkeyAdapter Says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
