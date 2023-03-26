package BinarySearch;

public class BinarySearch {
    public int binarySearch(int[] sortedArray, int key) {
        int firstEl = sortedArray[0];
        int lastEl = sortedArray.length-1;
        while(firstEl <= lastEl) {
            int middle = firstEl + (lastEl - firstEl) / 2;
            if (key < sortedArray[middle]) {
                lastEl = middle-1;
            } else if (key > sortedArray[middle]) {
                firstEl = middle+1;
            } else return middle;

        }
        return -1;
    }
}
