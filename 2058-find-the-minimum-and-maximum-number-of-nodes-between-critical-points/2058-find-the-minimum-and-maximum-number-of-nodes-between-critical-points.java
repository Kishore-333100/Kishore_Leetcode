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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstIdx=-1;
        int lastIdx=-1;
        int preval = head.val;
        ListNode curr = head.next;
        int mindis = Integer.MAX_VALUE;
        int idx=1;
        while(curr.next!=null){
            int currval = curr.val;
            int nextval = curr.next.val;
            boolean ismax = currval>preval && currval>nextval;
            boolean ismin = currval<preval && currval<nextval;
            if(ismax||ismin){
                if(firstIdx==-1) firstIdx=idx;
                else mindis = Math.min(mindis,idx-lastIdx);
            lastIdx = idx;
            }
            preval = curr.val;
            curr = curr.next;
            idx++; 
        }
        if(firstIdx==-1|| firstIdx==lastIdx)
            return new int[]{-1,-1};
        int maxDis  = lastIdx-firstIdx;
        return new int[]{mindis,maxDis};

    }
}