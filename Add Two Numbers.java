/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    private ListNode Solution1(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode head = res;
        int val1, val2;
        val1 = val2 = 0;
        while(l1 != null || l2 != null) {
            // System.out.println("something");
            if(val2 != 0) {
                val1 += val2;
            }
            
            if(l1 != null) val1 += l1.val;
            if(l2 != null) val1 += l2.val;
            
            // val1 += l1.val + l2.val;
            
            val2 = (val1 >= 10)?1:0;
            val1 = (val1 >= 10)?(val1-10):val1;
            
            res.val = val1;
            val1 = 0;
            
            if(l1 == null) l1 = new ListNode();
            if(l2 == null) l2 = new ListNode();
            
            if(l1.next != null || l2.next != null) {
                l1 = l1.next;
                l2 = l2.next;
                res.next = new ListNode();
                res = res.next;
            }
            else if(val2 != 0) {
                res.next = new ListNode(val2, null);
                l1 = null;
                l2 = null;
            }
            else {
                res.next = null;
                l1 = null;
                l2 = null;
            } 
                
        }
        return head;
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return Solution1(l1, l2);
    }
}