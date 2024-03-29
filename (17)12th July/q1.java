/* 155. Min Stack */

class MinStack {
    class Node{
        int val;
        int min;
        Node next;  
        public Node(int val,int min){
            this.val = val;
            this.min = min;
            next = null;
        }
    }
    Node head;
    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if(head == null){
            Node newNode = new Node(val,val);
            head = newNode;
        }
        else{
            Node newNode = new Node(val,Math.min(val,head.min));
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void pop() {
        if(head != null)
            head = head.next;
    }
    
    public int top() {
        if(head != null)
            return head.val;
        return -1;
    }
    
    public int getMin() {
        if(head != null)
            return head.min;
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */    