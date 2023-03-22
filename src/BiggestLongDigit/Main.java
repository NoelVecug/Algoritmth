package BiggestLongDigit;


import java.util.Arrays;
import java.util.Collections;

public class Main {
    // Из массива чисел собрать самое большое
    public static void main(String[] args) {
        int[] digits = {5,4,9,3,5,7,1};

        System.out.println(biggestDigit(digits));
        System.out.println(coolerBiggestDigit(digits));
    }
    private static String coolerBiggestDigit(int[] digits) {
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
    }
    private static String biggestDigit(int[] digits) {
        Arrays.sort(digits);
        StringBuilder newDigit = new StringBuilder();
        for (int i = digits.length-1; i >= 0; i--) {
            newDigit.append(digits[i]);
        }
        return newDigit.toString();
    }
}
