package basicStackOperations;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> reverse = new Stack<>();
        String[] input = scanner.nextLine().split("\\s++");

        for (String num : input) {
            reverse.push(Integer.parseInt(num));
        }

        int size = reverse.size();

        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", reverse.pop());
        }
    }
}
