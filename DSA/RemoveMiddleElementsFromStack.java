import java.util.Stack;

public class RemoveMiddleElementsFromStack {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Print the original stack
        System.out.println("Original Stack: " + stack);

        // Find the size of the stack
        int size = stack.size();

        // Create a temporary stack to hold elements
        Stack<Integer> tempStack = new Stack<>();

        // Calculate the middle index
        int middleIndex = size / 2;

        // Transfer elements to tempStack, skipping middle elements
        for (int i = 0; i < middleIndex; i++) {
            tempStack.push(stack.pop());
        }

        // Skip middle element if the size is odd
        if (size % 2 != 0) {
            stack.pop();
        }

        // Transfer remaining elements back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

        // Print the modified stack
        System.out.println("Stack after removing middle element(s): " + stack);
    }
}
