class RemDup{
    Node head;
    private int size;
    RemDup(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){    //constructor
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //last
     public void addlast(int data){
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
    public static RemDup merge(RemDup first,RemDup second){
        Node f=first.head;
        Node s=second.head;
        RemDup ans=new RemDup();
        while(f!=null &&s!=null){
            if(f.data<s.data){
                ans.addlast(f.data);
                f=f.next;
            }
            else{
                ans.addlast(s.data);
                s=s.next;
            }
        }
        while(f!=null){
            ans.addlast(f.data);
            f=f.next;
        }
        while(s!=null){
            ans.addlast(s.data);
            s=s.next;
        }
        return ans;
    }
    public void duplicates(){
        Node node=head;
        while(node.next!=null){
            if(node.data==node.next.data){
                node.next=node.next.next;
                size--;
            }
            else
            node=node.next;
        }
        node.next=null;
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
        RemDup list1= new RemDup();
        RemDup list2=new RemDup();
        list1.addlast(1);
        list1.addlast(3);
        list1.addlast(5);
        list2.addlast(1);
        list2.addlast(2);
        list2.addlast(9);
        list2.addlast(14);
        
        RemDup ans=RemDup.merge(list1,list2);
       
        //list.duplicates();

        ans.printLL();
        

        
    }
}