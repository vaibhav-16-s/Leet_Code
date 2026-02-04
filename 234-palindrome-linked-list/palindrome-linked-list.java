class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        ListNode first=head;
        ListNode second=head;
        while(first!=null && first.next!=null)
        {
            first=first.next.next;
            second=second.next;
        }

        if (first != null) {
            second = second.next;
        }

        ListNode head2=second;
        ListNode prev=null;
        ListNode temp=head2;
        while(temp!=null)
        {
            ListNode curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }

        ListNode left = head;
        ListNode right = prev;
        while (right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }
        return true;


    }
}