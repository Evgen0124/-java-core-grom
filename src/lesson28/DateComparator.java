package lesson28;

import java.util.Comparator;

/**
 * Created by user on 30.03.2018.
 */
public class DateComparator implements Comparator<Capability>{
    @Override
    public int compare(Capability o1, Capability o2) {
        return o2.getDateCreated().compareTo(o1.getDateCreated());
    }
}
