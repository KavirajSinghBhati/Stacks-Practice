package practice;

import java.util.Arrays;

class TwoStack {
    int[] arr;
    int cap;
    int top1, top2;

    TwoStack(int n) {
        cap = n;
        arr = new int[cap];
        top1 = -1;
        top2 = n;
    }

    // function to push in stack 1
    void push1 (int x) {
        if (top1 < top2 - 1)
            arr[++top1] = x;
        else
            System.out.println("Stack overflow");
    }

    // function to push in stack 2
    void push2 (int x) {
        if (top1 < top2 - 1)
            arr[--top2] = x;
        else
            System.out.println("Stack overflow");
    }

    // function to pop from stack 1
    int pop1 () {
        if (top1 >= 0)
            return arr[top1--];
        else {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
    }

    // function to pop from stack 2
    int pop2 () {
        if (top2 < cap)
            return arr[top2++];
        else {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
    }
}

public class TwoStacksInArrayEfficient {
    public static void main(String[] args) {
        TwoStack ts=new TwoStack(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 is: " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 is: " + ts.pop2());
    }
}
