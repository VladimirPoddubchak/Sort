package com.poddubchak.sort;

import com.poddubchak.sort.merge.SortMerge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] unsorted = {3,3,9,8,5,1,-8,12,0,0,34};
        int[] sorted = SortMerge.sortMerge(unsorted,0,unsorted.length-1);
        System.out.println(SortMerge.printArray(sorted));
    }
}
