package practice;

class TwoStacks {
    int[] arr;
    int cap;
    int top1, top2;

    TwoStacks (int n) {
        cap = n;
        arr = new int[cap];
        top1 = n / 2 + 1;
        top2 = n / 2;
    }

    // function to push in stack 1
    void push1 (int x) {
        if (top1 > 0) {
            top1--;
            arr[top1] = x;
        } else {
            System.out.println("Stack overflow");
        }
    }

    // function to push in stack 2
    void push2 (int x) {
        if (top2 < cap - 1) {
            top2++;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // function to pop from stack 1
    int pop1 () {
        if (top1 <= cap / 2) {
            return arr[top1++];
        } else {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
    }

    // function to pop from stack 2
    int pop2 () {
        if (top2 >= cap / 2 + 1) {
            return arr[top2--];
        } else {
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
    }
}

public class TwoStacksInArrayNaive {
    public static void main(String[] args) {
        TwoStacks s = new TwoStacks(5);
        s.push1(5);
        s.push2(10);
        s.push2(15);
        s.push1(11);
        s.push2(7);
        System.out.println("Popped element from stack1 is: " + s.pop1());
        s.push2(40);
        System.out.println("Popped element from stack2 is: " + s.pop2());
    }
}
