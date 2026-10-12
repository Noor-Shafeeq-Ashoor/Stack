import java.util.Stack;

public class EX3 {
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println(" ---- ");
            return;
        }

        int top = stack.pop();

        reverse(stack);

        insertAtBottom(stack, top);
    }

    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();

        insertAtBottom(stack, value);

        stack.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Before: " + stack);

        reverse(stack);

        System.out.println("After:  " + stack);
    }
}

