package ru.sin666.azarnin;

import java.util.Arrays;

public class MySortUtils {
    public static int[] sortBubble(int[] ints) {
        int[] result = Arrays.copyOf(ints,ints.length);
        Arrays.sort(result);
        return result;
    }
}

