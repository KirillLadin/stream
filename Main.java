import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static boys.BoyListGenerator.getBoysList;
import static boys.BoysFilter.getFilteredBoys;

final class Main {

    public static void main(final String[] args) {
        System.out.println(getFilteredBoys(getBoysList()));
    }
}
