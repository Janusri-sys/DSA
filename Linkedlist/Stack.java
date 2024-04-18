class Stack{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
             head=newNode;
             return;
        }
        newNode.next=head;
        head=newNode;

    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int delElement=head.data;
        head=head.next;
        return delElement;

    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}