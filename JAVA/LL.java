class LL{
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){    //constructor
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //add-first,last
    //first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    //last
     public void addlast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }
    //add at specific position
    public void addPos(String data,int pos){
        if(pos>size || pos<0){
            System.out.println("Invalid index value");
            return;
        }
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        for(int i=1;i<pos-1;i++){
           currNode=currNode.next; 
        }
        newNode.next=currNode.next;
        currNode.next=newNode;
    }
    //delete first
    public void delFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next; 
        size--;  
    }
    //delete last
    public void delLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        //one node
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
        secondLast.next=null;
    }
    //delete specific element
    public void delElement(String element){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        
        //one node
        if(head.next==null){
            if(head.data==element){
                size--;
                head=null;
            }
            else{
                System.out.println("element not found");
            }
            return;
        }
        //deleting element is at first
        if(head.data==element){
            delFirst();
            return;
        }
        Node previous=head;
        Node currNode=head.next;
        while(currNode.data!=element){
            if(currNode.next==null){
                if(currNode.data!=element){
                    System.out.println("element not found");
                    return;
                }
                else if(currNode.data==element){
                    delLast();
                    return;
                }
            }
            
            previous=previous.next;
            currNode=currNode.next;
        }
        size--;
        previous.next=currNode.next;
}
//print
public void printLL(){
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    Node currNode=head;
    while(currNode!=null){
        System.out.print(currNode.data+"->");
        currNode=currNode.next;
    }
    System.out.println("NULL");
    System.out.println(getSize());
}
//size
public int getSize(){
    return size;
}
 public static void main(String[] args){
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addlast("list");
        list.addPos("linked",4);
        list.printLL();
        list.delFirst();
        list.printLL();
        list.delLast();
        list.printLL();
        list.delElement("linked");
        list.printLL();
    }
}