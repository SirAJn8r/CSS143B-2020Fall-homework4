package Problem2;

public class SortList {
    private static final int SENTRY = Integer.MAX_VALUE;
    // DO NOT ADD ANY NEW MEMBER VARIABLE AND MEMBER FUNCTION

    // DO NOT CHANGE ANYTHING IN THIS FUNCTION
    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode mid = findMidAndBreak(head);
        return mergeLists(sortList(head), sortList(mid));
    }

    public static ListNode findMidAndBreak(ListNode head)
    {
        if(head == null || head.next == null) return null;
        int length = 1;
        ListNode pointer = head;
        while(pointer.next != null)
        {
            length++;
            pointer = pointer.next;
        }

        int mid = length / 2;
        pointer = head;
        for(int i = 0; i < mid-1; i++)
            pointer = pointer.next;

        ListNode temp = pointer.next;
        pointer.next = null;

        return temp;
    }

    public static ListNode mergeLists(ListNode list1, ListNode list2) {
        //just in case one is empty, return the other. If both are empty then my code already failed so no need to catch it
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode pointerA = list1;
        ListNode pointerB = list2;
        ListNode newList;
        if(list1.val < list2.val){ newList = list1; pointerA = pointerA.next; }
        else { newList = list2; pointerB = pointerB.next; }
        newList.next = null;
        ListNode newPointer = newList;


        while (pointerA != null && pointerB != null)
        {
            if(pointerA.val < pointerB.val)
            {
                newPointer.next = pointerA;
                pointerA = pointerA.next;
            }
            else
            {
                newPointer.next = pointerB;
                pointerB = pointerB.next;
            }
            newPointer = newPointer.next;
        }
        //if we didn't finish looking through, add the rest
        if (pointerA != null)
            newPointer.next = pointerA;
        if (pointerB != null)
            newPointer.next = pointerB;

        return newList;
    }
}
