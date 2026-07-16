package WEEK_2;

import java.util.Arrays;

public class DoubleEndedStack {
    static int top1 = -1;
    static int top2;

    public static boolean isEmpty(int stack[]) {
        return top1 == -1 && top2 == stack.length;
    }

    public static boolean isFull(int stack[]) {
        return top1 + 1 == top2;
    }

    public static int[] pushForward(int stack[], int n) {
        if (isFull(stack))
            System.out.print("Overflow...");
        else {
            top1++;
            stack[top1] = n;
        }
        return stack;
    }

    public static int[] pushBackward(int stack[], int n) {
        if (isFull(stack))
            System.out.print("Overflow...");
        else {
            top2--;
            stack[top2] = n;
        }
        return stack;
    }

    public static int[] popForward(int stack[]) {
        if (isEmpty(stack))
            System.out.print("No elements can be deleted...");
        else {
            stack[top1] = 0;
            top1--;
        }
        return stack;
    }

    public static int[] popBackward(int stack[]) {
        if (isEmpty(stack))
            System.out.print("No elements can be deleted...");
        else {
            stack[top2] = 0;
            top2++;
        }
        return stack;
    }

    public static void main(String[] args) {
        int[] stack = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Stack is empty: " + isEmpty(stack));
        System.out.println("Stack is full: " + isFull(stack));
        System.out.println("Pushing forward : " + Arrays.toString(pushForward(stack, 9)));
        System.out.println("Pushing backward : " + Arrays.toString(pushBackward(stack, 0)));
        System.out.println("Popping forward : " + Arrays.toString(popForward(stack)));
        System.out.println("Popping backward : " + Arrays.toString(popBackward(stack)));

    }
}
