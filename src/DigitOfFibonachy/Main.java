package DigitOfFibonachy;
// Вычислить число Фибоначчи
public class Main {
    private static final int CONST = 10;
    public static void main(String[] args) {
        System.out.println(calculate(CONST));
    }
    private static long calculate(int n) {
        if (n <= 1) {
            return n;
        }
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }
}
