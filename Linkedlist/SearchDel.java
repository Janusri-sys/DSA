class SearchDel{

    Node head;
    int size;
    SearchDel(){
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
    //Finding Nth node
    public void findNth(int n){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(n==size){
            head=head.next;
            return;
        }
        int posFromFirst=size-n;
        Node prev=head;
        for(int i=1;i<posFromFirst;i++){
            prev=prev.next;
        }
       prev.next=prev.next.next;


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
    public static void main(String[] args){
        SearchDel list=new SearchDel();
        list.addFirst(1);
        list.addFirst(2);
        // list.addLast(3);
        // list.addLast(4);
        list.findNth(2);
        list.print();
        System.out.println("size="+list.size);
    }
}