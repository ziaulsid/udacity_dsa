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
                System.out.println(temp.val + " ");
                temp = temp.next;
                count++;
                
                
                if(count == index){
                    return temp.val;
                }
            }
            return -1;
        }
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        
        Node node = new Node(val);
        if(head == null){
            head = node;
            
        }else{
            
            node.next = head;
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
        if(index == 0){
            addAtHead(newNode.val);
        }
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
        if(length() == index){
            temp.next = newNode;
        }
        
    }
    public int length(){
        
        if(head == null) return -1;
        Node temp = head;
        int size = 1;
        while(temp.next != null){
            size++;
            temp = temp.next;
        }
         return size;
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
        if(head == null) return;
        
        if(index == 0 && length() == 1){
            
            head = null;
            return;
        }
        
        if(index == 0){
            head = head.next;
        }
        
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
            prev = prev.next;
            
        } 
    }
    
    public void printList(){
        
        if(head == null){
            System.out.print("List is empty!");
        }
        else{
            
            Node current = head;
            while(current.next != null){
                
                System.out.print(current.val + ",");
                current = current.next;
            }
        }
    }
}