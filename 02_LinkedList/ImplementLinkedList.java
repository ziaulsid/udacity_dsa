class MyLinkedList {
    
    Node head;
    
    class Node {
        
        int val;
        Node next;
        
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    /** Initialize your data structure here. */
    public MyLinkedList() {
        
         head = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        
        if(head == null) return -1;
        if(index == 0) return head.val;
        else{
            int count = 0;
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
                count++;
                
                if(count == index){
                    break;
                }
                else {
                    return -1;
                }
            }
            return temp.val;
        }
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        
        Node node = new Node(val);
        if(head == null){
            head = node;
        }else{
            
            node.next = head.next;
            head = node;
            
        }
        
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        
        Node node = new Node(val);
        if(head == null){
            head = node;
        }else{
            
           Node temp = head;
           while(temp.next != null){
                temp = temp.next;
           }
           
            temp.next = node;
            
            
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        
        if(head == null) return;
        Node newNode = new Node(val);
        int count = 0;
        Node temp = head;
        while(temp.next != null){
            count++;
            if(count == index) {
                
                newNode.next = temp.next;
                temp.next = newNode;
                
            } else{
                
                temp = temp.next;
            }
            
        } 
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
        if(head == null) return;
        
        int count = 0;
        Node temp = head;
        Node prev = head;
        while(temp.next != null){
            temp = temp.next;
            count++;
            if(count == index) {
                
                prev.next = temp.next;
                temp.next = null;
                
            } 
            
        } 
    }
}
