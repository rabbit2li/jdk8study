package test;

import java.util.Arrays;

public class Seven {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1234567; i < 1666666; i++) {
            char[] arr = getNum(i);
            if (Arrays.equals(arr, getNum(i * 2)) && Arrays.equals(arr, getNum(i * 3)) &&
                    Arrays.equals(arr, getNum(i * 4)) && Arrays.equals(arr, getNum(i * 5))
                    && Arrays.equals(arr, getNum(i * 6))) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));
    }

    public static char[] getNum(int i) {
        char[] arr = String.valueOf(i).toCharArray();
        Arrays.sort(arr);
        return arr;
    }
}
