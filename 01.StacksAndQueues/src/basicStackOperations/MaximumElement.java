package basicStackOperations;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfLines = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < numOfLines; i++) {
            int command = scanner.nextInt();

            if (command == 1) {
                int numToPush = scanner.nextInt();
                stack.push(numToPush);

                if (maxElement <= numToPush) {
                    maxElement = numToPush;
                    maxStack.push(maxElement);
                }
            } else if (command == 2) {
                int popedItem = stack.pop();

                if (popedItem == maxElement) {
                    maxStack.pop();
                    if (maxStack.size() > 0) {
                        maxElement = maxStack.peek();
                    } else {
                        maxElement = Integer.MIN_VALUE;
                    }
                }
            } else if (command == 3) {
                System.out.println(maxElement);
            }
        }
    }
}
