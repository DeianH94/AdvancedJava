package basicStackOperations;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int elementsToPush = Integer.parseInt(input[0]);
        int elementsToPop = Integer.parseInt(input[1]);
        int checkForElement = Integer.parseInt(input[2]);

        Stack<Integer> stack = new Stack<>();
        String[] elements = scanner.nextLine().split("\\s+");

        for (int i = 0; i < elementsToPush; i++) {
            stack.push(Integer.parseInt(elements[i]));
        }

        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();
        }

        if (stack.size() == 0) {
            System.out.println("0");
        } else if (stack.contains(checkForElement)) {
            System.out.println("true");
        } else {
            ArrayList<Integer> array = new ArrayList<>(stack);
            int minElement = Integer.MAX_VALUE;

            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) < minElement) {
                    minElement = array.get(i);
                }
            }

            System.out.println(minElement);
        }
    }
}
