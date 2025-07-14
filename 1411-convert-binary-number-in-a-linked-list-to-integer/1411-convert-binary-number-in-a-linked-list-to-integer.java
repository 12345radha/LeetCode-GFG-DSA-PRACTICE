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
    public int getDecimalValue(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            st.push(temp.val);
            temp=temp.next;
        }
        
        int cnt=0;
        int ans=0;
        while(!st.isEmpty())
        {
           ans+=Math.pow(2,cnt)*st.peek();
           st.pop();
           cnt++;
        }
    
return ans;
        
    }
}