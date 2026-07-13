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
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Boolean> map=new HashMap<>();
        ListNode ans= head;
        while(ans!=null){
            if(map.containsKey(ans)){
            return true;
            }
            else{
                map.put(ans,true);
            }
            ans=ans.next;
        }
       return false; 
        
    }
}
