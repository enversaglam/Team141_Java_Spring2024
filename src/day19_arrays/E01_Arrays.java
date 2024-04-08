package day19_arrays;

import java.util.Arrays;

public class E01_Arrays {
    public static void main(String[] args) {
        int[] arr = new int[4]; // [0, 0, 0, 0]

        System.out.println(arr[2]);

        arr[0]=3;
        arr[1]=5;
        arr[2]=6;
        arr[3]=4;

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
