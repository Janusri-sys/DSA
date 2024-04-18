class LL1{

    static Node head;
    int size;
    LL1(){
        this.size=0;
    }
    class Node{
        int data;
        Node next=null;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //Adding

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void addAtPos(int data,int pos){
        if(pos>size){
            System.out.println("Out of Index");
            return;
        }
        if(pos==1){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    //Deleting

    public void delFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }

    public void delLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        Node prevtemp=temp;
        while(temp.next!=null){
            prevtemp=temp;
            temp=temp.next;
        }
        prevtemp.next=null;
        size--;
    }
    public void delElement(int element){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.data==element){
            delFirst();
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        if(temp.data==element){
            delLast();
            return;
        }
        temp=head;
        Node prevtemp=temp;
        while(temp.data!=element){
            prevtemp=temp;
            temp=temp.next;
        }
        prevtemp.next=temp.next;
        size--;
    }

    //Printing

    public void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");


    }
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node newNode=new Node(val);
            newNode.next=node;
            return newNode;
        }
        node.next=insertRec(val,index--,node.next);
        return node;
    }


    public static void main(String[] args){
        LL1 list=new LL1();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        //list.addAtPos(100,3);
        list.addLast(4);
        list.addLast(5);
        //list.delFirst();
        //list.delLast();
        //list.delElement(3);
        list.print();
        list.insertRec(10,3);
        list.print();
        System.out.println("size="+list.size);
    }
}