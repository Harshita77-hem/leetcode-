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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode head=lists[i];
            while(head!=null){
                pq.add(head.val);
                head=head.next;
            }
        }
        ListNode h=null;
        ListNode t=null;
        while(!pq.isEmpty()){
            int num=pq.remove();
            ListNode n=new ListNode(num);
            if(h==null){
                h=n;
                t=n;

            }
            else{
                t.next=n;
                t=n;
            }
        }
        return h;
        
    }
}