package practice;

import java.util.ArrayDeque;

public class StockSpanEfficient {
    public static void main(String[] args) {
        int[] arr = {13, 15, 12, 14, 16, 8, 6, 4, 10, 30};
        stockSpan(arr, arr.length);
    }

    static void stockSpan(int[] arr, int n) {

        ArrayDeque<Integer> s = new ArrayDeque<>(); // create stack
        s.push(0); // push first element index
        System.out.print("1 "); // process first element

        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i])
                s.pop();
            int span = s.isEmpty() ? i + 1 : i - s.peek();
            System.out.print(span + " ");
            s.push(i);
        }
    }
}
