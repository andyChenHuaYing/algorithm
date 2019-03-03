package org.oscar.algo.sort;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] a, int p, int r) {
        sortInternally(a, p, r);
    }

    private static void sortInternally(int[] a, int p, int r) {
        System.out.println(String.format("p -> %s, r -> %s, a -> %s", p, r, Arrays.toString(a)));
        if (p >= r) {
            return;
        }
        int q = p + (r - p)/2;
        sortInternally(a, p, q);
        sortInternally(a, q + 1, r);

        merge(a, p, q, r);
    }


    private static void merge(int[] a, int p, int q, int r) {
        System.out.println(String.format("Before merge: p -> %s, r -> %s, a -> %s", p, r, Arrays.toString(a)));
        int[] temp = new int[r - p + 1];

        int i = p;
        int j = q + 1;
        int k = 0;

        while (i <= q && j <= r) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        int start;
        int end;
        if (j <= r) {
            start = j;
            end = r;
        } else {
            start = i;
            end = q;
        }

        while (start <= end) {
            temp[k++] = a[start++];
        }

        for (int l = 0; l <= r-p; ++l) {
            a[p+l] = temp[l];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{7, 5, 6, 2, 4, 3};
        sort(a, 0, a.length - 1);
        System.out.println("-------------------");
        System.out.println(Arrays.toString(a));
    }
}