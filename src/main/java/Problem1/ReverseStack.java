package Problem1;

import java.util.Stack;

public class ReverseStack
{
    public static void reverseStack(Stack<Integer> stack)
    {
        if(stack.isEmpty()) return;

        int temp = stack.pop();
        reverseStack(stack);

        reverseHelper(temp, stack);
    }

    //puts temp at bottom of stack
    private static void reverseHelper(int temp, Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            stack.push(temp);
            return;
        }

        int top = stack.pop();
        reverseHelper(temp, stack);
        stack.push(top);
    }
}