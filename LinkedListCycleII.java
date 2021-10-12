/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> NodeCyc = new HashSet<ListNode>();
        while(head!=null){
            if(NodeCyc.contains(head))
                return head;
            NodeCyc.add(head);
            head = head.next;
        }
        return null;
    }
}
