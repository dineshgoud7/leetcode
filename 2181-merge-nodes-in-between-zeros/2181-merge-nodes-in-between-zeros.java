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
    public ListNode mergeNodes(ListNode head) {

        ListNode temp=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(temp!=null){
            int sum=0;
            if(temp.val==0){
                temp=temp.next;
                while(temp!=null && temp.val!=0){
                    sum+=temp.val;
                    temp=temp.next;
                }
                if(temp!=null){
                    list.add(sum);
                }
            }
        }
        head=null;
        head=new ListNode(list.get(0));
        ListNode curr=head;
        for(int i=1;i<list.size();i++){
            curr.next=new ListNode(list.get(i));
            curr=curr.next;
        }
        return head;
    }
}