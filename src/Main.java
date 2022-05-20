import java.util.Scanner;

class MyStack {
    int[] arr;
    int cap;
    int top;

    MyStack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return arr[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("Array implementation of stack");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top item");
            System.out.println("4. Size");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter ele to add");
                    int x = sc.nextInt();
                    s.push(x);
                }
                case 2 -> System.out.println("Popped value: " + s.pop());
                case 3 -> System.out.println("Top is: " + s.peek());
                case 4 -> System.out.println("Size: " + s.size());
                case 5 -> System.exit(0);
                default -> System.out.println("Wrong choice");
            }
        }
    }
}


// Array implementation of stack
// issues: resizing