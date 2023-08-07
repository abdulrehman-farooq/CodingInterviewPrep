package CodeTemplate;

import java.util.*;

public class ArrayCodeTemplate {
    public static void main(String[] args) {

        /*
         * One Dimensional Array Code Template
         *
         */

        Integer[] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
        Integer[] array2 = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};

        List oneDList = Arrays.asList(array);




        Arrays.sort(array, Collections.reverseOrder());// Reverse order only work with primitive type
        System.out.println("Array elements in descending order: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Array elements in ascending order: " + Arrays.toString(array));

        Arrays.sort(array2, (a, b) -> a - b);
        System.out.println("Array elements in ascending order: " + Arrays.toString(array2));

        Arrays.sort(array2, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });
        System.out.println("Array elements in descending order: " + Arrays.toString(array2));

        /*
         *  Two Dimensional Arrays
         *
         */
        Integer[][] intervals2 = new Integer[10][10];

        int[][] intervals = new int[][]{
                {1, 2},
                {4, 5}
        };

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(final int[] a, final int[] b) {
                return a[0] - b[0];
            }
        });

        List<List<Integer>> intervalsList = new ArrayList<List<Integer>>();
        for (Integer[] integers : intervals2) {
            intervalsList.add(Arrays.asList(integers));
        }



    }
}
