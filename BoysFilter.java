package boys;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class BoysFilter {

    public static Map<String, Long> getFilteredBoys(ArrayList<Boy> boys) {
        return boys.stream().filter(x -> x.getAge() >= 18)
                        .map(Boy::getName)
                        .distinct()
                        .sorted()
                        .limit(4)
                        .collect(Collectors.toMap(boy -> boy,
                                boy -> boys.stream().filter(y -> y.getName().equals(boy)).count() - 1));
    }
}
