package CodeTemplate;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetTemplate {
    public static void main(String[] args) {
        String[] supplies = new String[]{"flour", "yeast"};
        Set<String> available = Stream.of(supplies).collect(Collectors.toCollection(HashSet::new));


    }
}
