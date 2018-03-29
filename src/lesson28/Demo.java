package lesson28;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by user on 30.03.2018.
 */
public class Demo {
    public static void main(String[] args) {
        Capability capability1 = new Capability(1001,"test", "rrrr", true, new Date());
        Capability capability2 = new Capability(1005,"test", "rrrr", true, new Date());
        Capability capability3 = new Capability(999,"test", "rrrr", true, new Date());

        Set<Capability> set = new TreeSet<>();
        set.add(capability1);
        set.add(capability2);
        set.add(capability3);
    }
}
