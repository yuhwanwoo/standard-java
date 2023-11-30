package test;

import java.util.Arrays;

public class SortTest {
    public static void main(String[] args) {
        String[] arr = {"testAdmin3","rowan12", "rowan00", "rowan01", "_testAdmin"};
        Arrays.sort(arr);

        // testAdmin3, rowan12, rowan00, rowan01, _testAdmin

        for (String s : arr) {
            System.out.println("s = " + s);
        }
    }
}
