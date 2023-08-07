package CodeTemplate;

import java.util.*;

public class TestTemplate {
    public static void main(String[] args) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, map.getOrDefault(1, new ArrayList<>()));
        map.get(1).add(1);

        Queue<Integer> queue = new LinkedList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());


    }
}
