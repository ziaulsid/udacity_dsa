public Node flatten(Node head) {	
    	if(head == null)
    		return null;
    	
    	Node newHead = new Node();
    	Node newCurr = newHead;
    	
    	Stack<Node> stack = new Stack<Node>();
    	stack.push(head);
    	
    	while(!stack.isEmpty()) {
    		Node temp = stack.pop();
    		if(temp != null) {
        		if(temp.child != null) {
        			stack.push(temp.next);
        			stack.push(temp.child);
        		}
        		else {
        			stack.push(temp.next);
        		}
        		temp.next = null;
        		temp.prev = null;
        		temp.child = null;
    			newCurr.next = temp;
    			temp.prev = newCurr;
    			newCurr = newCurr.next;
    		}        
    	}
    	newHead.next.prev = null;
    	return newHead.next;
    }