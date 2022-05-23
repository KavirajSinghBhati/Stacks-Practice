package practice;

class KStack {
    int[] arr;
    int[] top;
    int[] next;
    int cap, k;
    int freeTop;

    KStack(int s, int n) {
        k = s; cap = n;
        arr = new int[cap];
        top = new int[k];
        next = new int[cap];

        for (int i = 0; i < k; i++)
            top[i] = -1;

        freeTop = 0;
        for (int i=0; i<cap-1; i++)
            next[i] = i+1;
        next[cap-1] = -1;
    }

    boolean isFull() {
        return (freeTop == -1);
    }

    boolean isEmpty(int sn) {
        return (top[sn] == -1);
    }

    void push(int x, int sn) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        int i = freeTop;
        freeTop = next[i];
        next[i] = top[sn];
        top[sn] = i;
        arr[i] = x;
    }

    int pop(int sn) {
        if (isEmpty(sn)) {
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }
        int i = top[sn];
        top[sn] = next[i];
        next[i] = freeTop;
        freeTop = i;
        return arr[i];
    }
}

public class KStacks {
    public static void main(String[] args) {
        int k = 3, n = 10;
        KStack ks= new KStack(k, n);

        ks.push(15, 2);
        ks.push(45, 2);

        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2) );
        System.out.println("Popped element from stack 1 is " + ks.pop(1) );
        System.out.println("Popped element from stack 0 is " + ks.pop(0) );
    }
}


/*
*  solution on coding ninjas
*
* public class NStack {
    // Initialize your data structure.
    int[] arr;
    int[] top;
    int[] next;
    int n;
    int s;
    int freetop;

    public NStack(int N, int S) {
        // Write your code here.
        n = N;
        s = S;
        arr = new int[s];
        top = new int[n];
        next = new int[s];

        // initialise top
        for (int i = 0; i < n; i++) {
            top[i] = -1;
        }

        // initialise next
        for (int i = 0; i < s; i++) {
            next[i] = i + 1;
        }
        // update last index value to -1
        next[s - 1] = -1;

        // initialise freetop
        freetop = 0;
    }

    // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
    public boolean push(int x, int m) {
        // Write your code here.
        // overflow condition
        if (freetop == -1)
            return false;
        int index = freetop;
        arr[index] = x;
        freetop = next[index];
        next[index] = top[m - 1];
        top[m - 1] = index;
        return true;
    }

    // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        // Write your code here.

        // underflow condition
        if (top[m - 1] == -1)
            return -1;
        int index = top[m - 1];
        top[m - 1] = next[index];
        next[index] = freetop;
        freetop = index;
        return arr[index];
    }
}
*  */
