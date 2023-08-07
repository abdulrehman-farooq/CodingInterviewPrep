package CodeTemplate;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class LinkedListTemplate {

    public static void main(String[] args) {
        LinkedList<int[]> output = new LinkedList<int[]>();
        output.add(0, new int[]{1, 2});
        output.stream().map(x -> x[0]).collect(Collectors.toList()).toArray();

    }

}
