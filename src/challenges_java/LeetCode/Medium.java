package challenges_java.LeetCode;


import org.w3c.dom.Node;

class ListNode {


   int val;
   ListNode next;

   ListNode() { }

   ListNode(int val) {

       this.val = val;
   }

   ListNode(int val, ListNode next) {

       this.val = val;
       this.next = next;
   }
}

public class Medium {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode newNode = new ListNode();
        ListNode current = newNode;
        int total = 0;
        int oneDigit = 0 ;

        while( (l1 != null) || (l2 != null)) {

            int a = (l1 != null) ? l1.val : 0;
            int b = (l2 != null) ? l2.val : 0;

            total = oneDigit+ a + b;

            oneDigit = total / 10;
            current.next = new ListNode(total % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (oneDigit > 0) {
            current.next = new ListNode(oneDigit);
        }
        return newNode.next;
    }


    public static void main(String[] args) {

    }
}
