package Problem3;

import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print)
    {
        if(list == null)
            return;
        printHelper(list, print);
    }
    public static void printHelper(ListNode list, PrintStream print)
    {
        if(list.next == null)
        {
            print.print(list.val + " ");
            return;
        }
        printHelper(list.next, print);
        print.print(list.val + " ");
    }
}
