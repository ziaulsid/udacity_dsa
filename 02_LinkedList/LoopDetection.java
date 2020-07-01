public class LoopDetection {

    public boolean hasCycle(ListNode head) {
        
        if(head == null ) return false;
        
        if(null == head.next) return false;
     
        ListNode prev = head;
        ListNode curr = head;
        
        while(curr != null && prev !=null && curr.next != null){            
            
            prev = prev.next;
            curr = curr.next.next;
            
            if(curr == prev) {
                return true;
            }            
        }        
        return false;
    }
}