package CodeTemplate;

import java.util.*;

public class ListCodeTemplate {
    public static void main(String[] args) {

        /*
         * One Dimensional Array Code Template
         *
         */
        List<Integer> arrayList1 = new ArrayList<Integer>();
        List<Integer> arrayList3 = Arrays.asList(23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205);
        List<Integer> arrayList4 = new ArrayList<Integer>(arrayList3);

        Collections.sort(arrayList3, Collections.reverseOrder());// Reverse order only work with primitive type
        System.out.println("Array elements in descending order: " + Arrays.toString(arrayList3.toArray()));

        Collections.sort(arrayList3);
        System.out.println("Array elements in ascending order: " + Arrays.toString(arrayList3.toArray()));

        Collections.sort(arrayList3, (a, b) -> a - b);
        System.out.println("Array elements in ascending order: " + Arrays.toString(arrayList3.toArray()));


        Collections.sort(arrayList4, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        System.out.println("Array elements in descending order: " + Arrays.toString(arrayList4.toArray()));


        /*
         *  Two Dimensional List
         *
         */
        List<List<Integer>> List2D = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            List2D.add(Arrays.asList(23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205));
        }

        Collections.sort(List2D, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                return b.get(0) - a.get(0);
            }
        });

        /***
         * List to array conversion
         */
        int[] arr = arrayList1.stream().mapToInt(i -> i).toArray();


    }
}
