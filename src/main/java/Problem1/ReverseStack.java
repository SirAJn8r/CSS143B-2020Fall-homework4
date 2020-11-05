package Problem1;

import java.util.Stack;

public class ReverseStack
{
    public static void reverseStack(Stack<Integer> stack)
    {
        if(stack.empty())
            return;
        int temp = stack.pop();
        reverseStack(stack);
        stack.push(temp);
    }
}