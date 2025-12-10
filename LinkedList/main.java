package LinkedList;

import java.util.LinkedList;
import java.util.Collections;

public class main {

    public static void main(String[] args) {
        ListNode ex1List1 = buildList(new int[]{1, 2, 4});
        ListNode ex1List2 = buildList(new int[]{1, 3, 4});

        Solution solution = new Solution();
        ListNode merged1 = solution.mergeTwoLists(ex1List1, ex1List2);
        System.out.print("Example 1: ");
        printList(merged1);

        ListNode ex2List1 = null;
        ListNode ex2List2 = null;
        ListNode merged2 = solution.mergeTwoLists(ex2List1, ex2List2);
        System.out.print("Example 2: ");
        printList(merged2);

        ListNode ex3List1 = null;
        ListNode ex3List2 = buildList(new int[]{0});
        ListNode merged3 = solution.mergeTwoLists(ex3List1, ex3List2);
        System.out.print("Example 3: ");
        printList(merged3);

        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(1);
        ll1.add(2);
        ll1.add(4);

        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(1);
        ll2.add(3);
        ll2.add(4);

        LinkedList<Integer> mergedLL = new LinkedList<>(ll1);
        mergedLL.addAll(ll2);
        Collections.sort(mergedLL);

        System.out.print("Using java.util.LinkedList + Collections: ");
        System.out.println(mergedLL);
    }

    private static ListNode buildList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int v : values) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        return dummy.next;
    }

    private static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) {
                System.out.print(" -> ");
            }
            cur = cur.next;
        }
        System.out.println();
    }
}