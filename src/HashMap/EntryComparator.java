package HashMap;

import javax.swing.text.html.parser.Entity;
import java.util.Comparator;
import java.util.Map;

public class EntryComparator implements Comparator <Map.Entry> {
    @Override
    public int compare(Map.Entry o1, Map.Entry o2) {
        return 0;
    }

//    @Override
//    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//        Integer a = o1.getValue();
//        Integer b = o2.getValue();
//        return a.compareTo(b);
//    }

}
