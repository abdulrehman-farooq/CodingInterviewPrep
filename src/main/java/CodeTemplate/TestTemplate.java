package CodeTemplate;

import java.util.*;

public class TestTemplate {
    public static void main(String[] args) {
        //Create and perform stack push,pop and peek operation
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        while (!stack.isEmpty()) {
            int peek = stack.peek();
            int pop = stack.pop();
            System.out.println("Stack pop " + pop);
            System.out.println("Stack peek " + peek);
        }

        // Creat Normal Queue and perform poll and peek operation
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        while (!queue.isEmpty()) {
            int peek = queue.peek();
            int poll = queue.poll();
            System.out.println("Queue poll " + poll);
            System.out.println("Queue peek " + peek);
        }

        // Create Max Heap and perform operation poll and peek
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(8);

        while (!priorityQueue.isEmpty()) {
            int peek = priorityQueue.peek();
            int poll = priorityQueue.poll();
            System.out.println("max Heap poll " + poll);
            System.out.println("max Heap peek " + peek);
        }

        // Create Min Heap and perform operation poll and peek
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(8);

        while (!minHeap.isEmpty()) {
            int peek = minHeap.peek();
            int poll = minHeap.poll();
            System.out.println("minHeap poll " + poll);
            System.out.println("minHeap peek " + peek);
        }

        // Create HashMap and perform operation getOrDefault, put keySet

        HashMap<String, String> map = new HashMap<>();
        map.put("test", map.getOrDefault("test", "default"));
        map.put("test2", map.getOrDefault("test", "default2"));
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        // String Manipulation
        String strLower = "abcd";
        String strUpper = "ABCD";
        String numberStr = String.valueOf(1123);
        int number = Integer.parseInt(numberStr);

        for (int i = 0; i < strLower.length(); i++) {
            char c = strLower.charAt(i);
            int ascii = c - 'a';
            System.out.println(ascii);
        }

        for (int i = 0; i < strUpper.length(); i++) {
            char c = strUpper.charAt(i);
            int ascii = c - 'A';
            System.out.println(ascii);
        }

    }
}

