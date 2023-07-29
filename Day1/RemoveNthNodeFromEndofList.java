# Remove Nth Node From End of List
## Problem Description

Given the head of a linked list, remove the nth node from the end of the list and return its head.

## Example

### Example 1:
  Input: head = [1,2,3,4,5], n = 2
  Output: [1,2,3,5]
### Example 2:
Input: head = [1], n = 1
Output: []
### Example 3:
Input: head = [1,2], n = 1
Output: [1]
## Constraints:

- The number of nodes in the list is sz.
- `1 <= sz <= 30`
- `0 <= Node.val <= 100`
- `1 <= n <= sz`







  SOULUTION:
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode l=dummy;
        ListNode r=dummy;
        for(int i=1;i<=n+1;i++){
            r=r.next;
        }
        while(r!=null){
            l=l.next;
            r=r.next;
        }
        l.next=l.next.next;
        return dummy.next;

    }
}

  
