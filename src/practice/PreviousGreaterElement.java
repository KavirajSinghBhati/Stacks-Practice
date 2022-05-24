package practice;

/*
Given an array of distinct integers,
find the closest (positive wise) greater on left of every element.
If there is no greater element on left, then print -1
*/

import java.util.ArrayDeque;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        //naiveApproach(arr, arr.length);
        efficientApproach(arr, arr.length);
    }

    static void naiveApproach(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
            if (j == -1)
                System.out.print("-1 ");
        }
    }

    static void efficientApproach(int[] arr, int n) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(arr[0]);
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();
            int prevGreater = s.isEmpty() ? -1 : s.peek();
            System.out.print(prevGreater + " ");
            s.push(arr[i]);
        }
    }
}
