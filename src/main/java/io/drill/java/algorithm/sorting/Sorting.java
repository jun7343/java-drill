package io.drill.java.algorithm.sorting;

import java.util.Arrays;

public class Sorting {

    public int[] bubble(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
            printArray(array);
        }

        return array;
    }

    public int[] selection(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            printArray(array);
        }

        return array;
    }

    public int[] insertion(int[] array) {
        int key = 0;
        int temp = 0;

        for (int i = 1; i < array.length; i++) {
            key = i;

            for (int j = i - 1; j >= 0; j--) {
                if (array[key] < array[j]) {
                    temp = array[key];
                    array[key] = array[j];
                    array[j] = temp;

                    key = j;
                }
            }
            printArray(array);
        }

        return array;
    }

    public int[] merge(int[] array) {
        if (array.length == 1) {
            return array;
        } else if (array.length == 2) {
            if (array[0] > array[1]) {
                int temp = array[0];
                array[0] = array[1];
                array[1] = temp;
            }

            return array;
        } else {
            int[] leftArray = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] rightArray = Arrays.copyOfRange(array, array.length / 2, array.length);

            leftArray = merge(leftArray);
            rightArray = merge(rightArray);

            int[] mergeArray = new int[leftArray.length + rightArray.length];
            int index = 0; // mergeArray index
            int i = 0; // leftArray index
            int j = 0; // rightArray index

            while (index < mergeArray.length) {
                if (i < leftArray.length && j < rightArray.length) {
                    if (leftArray[i] < rightArray[j]) {
                        mergeArray[index] = leftArray[i];
                        i++;
                    } else {
                        mergeArray[index] = rightArray[j];
                        j++;
                    }
                } else if (i < leftArray.length) {
                    mergeArray[index] = leftArray[i];
                    i++;
                } else if (j < rightArray.length) {
                    mergeArray[index] = rightArray[j];
                    j++;
                }

                index++;
            }

            System.out.print("Left Array = ");
            printArray(leftArray);
            System.out.print("Right Array = ");
            printArray(rightArray);
            System.out.print("Merge Array = ");
            printArray(mergeArray);

            return mergeArray;
        }
    }

    // quick method usage: quick(array, 0, array.length - 1);
    public int[] quick(int[] array, int left, int right) {
        if (left >= right) {
            return array;
        }

        int pivot = (left + right) / 2;
        int start = left;
        int end = right;
        int temp = 0;

        while (pivot > start || pivot < end) {
            while (array[pivot] > array[start]) start++;
            while (array[pivot] < array[end]) end--;

            if (pivot != start && pivot != end) {
                temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            } else if (pivot == start) {
                temp = array[end];
                array[end] = array[start];
                array[start] = temp;

                pivot = end;
            } else if (pivot == end) {
                temp = array[end];
                array[end] = array[start];
                array[start] = temp;

                pivot = start;
            }
        }

        int[] leftQuick = quick(array, left, pivot - 1);
        int[] rightQuick = quick(leftQuick, pivot + 1, right);

        return rightQuick;
    }

    public void printArray(int[] array) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(String.format("[%d]", array[i]));
        }

        System.out.println(sb.toString());
    }
}
