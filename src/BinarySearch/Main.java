package BinarySearch;

import java.util.Arrays;

public class Main {
    // Реализовать бинарный поиск в масссиве
    public static void main(String[] args) {
        int[] array = {1,5,8,63,7,1,5,10};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(array, 10));
    }
}
