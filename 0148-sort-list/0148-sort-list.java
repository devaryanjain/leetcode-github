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
    public ListNode sortList(ListNode head)
    {
    //     if(head==null || head.next==null)return head;
    //     ListNode mid = middle(head);
    //     ListNode right = mid.next;
    //     mid.next = null;
    //     ListNode left = head;
    //     left = sortList(left);
    //     right = sortList(right);
    //     return mergeTwo(left,right);
    // }
    // public ListNode middle(ListNode head)
    // {
    //     ListNode slow = head;
    //     ListNode fast = head.next;
    //     while(fast!=null && fast.next!=null)
    //     {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }
    
    // public ListNode mergeTwo(ListNode list1, ListNode list2)
    // {
    //     ListNode dummy = new ListNode(-1);
    //     ListNode temp = dummy;
    //     ListNode t1 = list1;
    //     ListNode t2 = list2;

    //     while(t1!=null && t2!=null)
    //     {
    //         if(t1.val < t2.val)
    //         {
    //             temp.next = t1;
    //             temp = t1;
    //             t1 = t1.next; 
    //         }
    //         else
    //         {
    //             temp.next = t2;
    //             temp = t2;
    //             t2 = t2.next; 
    //         }
    //     }
    //     if(t1!=null)temp.next = t1;
    //     else temp.next = t2;
    //     return dummy.next;
        if(head == null || head.next==null) return head;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while(curr != null)
        {
            arr.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(arr);
        curr = head;
        int i = 0 ;
        while(curr!=null)
        {
            curr.val = arr.get(i);
            curr = curr.next;
            i++;
        }
        return head;
    }

}