package com.poddubchak.sort.merge;

public class SortMerge {

    public static int[] sortMerge(int[] unsorted,int first, int last) {
        int[] sorted = new int[unsorted.length];
        if(first==last){
            return unsorted;
        }
        if (first < last) {
            int mid = (last + first) / 2;
            int[] left = sortMerge(unsorted, first, mid);
            int[] right = sortMerge(unsorted, mid + 1, last);

            int leftIndex = first;
            int rightIndex = mid+1;
            int index=first;
            while ((leftIndex<= mid) &(rightIndex<=last)) {
                if (left[leftIndex] < right[rightIndex]) {
                    sorted[index] = left[leftIndex];
                    index++;
                    leftIndex++;
                } else {
                    sorted[index] = right[rightIndex];
                    index++;
                    rightIndex++;
                }
                if(leftIndex>mid){
                    while (rightIndex<=last){
                        sorted[index] = right[rightIndex];
                        index++;
                        rightIndex++;
                    }
                }
                if(rightIndex>last){
                    while (leftIndex<= mid){
                        sorted[index] = left[leftIndex];
                        index++;
                        leftIndex++;
                    }
                }
            }
        }
        return sorted;
    }

    public static String printArray(int[] array){
        StringBuilder result = new StringBuilder();
        for (int i=0;i<array.length;i++){
            result = result.append("["+array[i]+ "]");
        }
        return result.toString();
    }
}
