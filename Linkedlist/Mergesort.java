class Mergesort{
    ListNode head;
    int size; 
    class ListNode{
        int data;
        ListNode next;

        ListNode(){
            size++;
        }

        ListNode(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    Mergesort(){
        this.size=0;
    }

    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummyHead=new ListNode();
        ListNode tail=dummyHead;
        while(list1!=null && list2!=null){
            if(list1.data<list2.data){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
            tail.next=(list1!=null)?list1:list2;

        return dummyHead.next;
    }

    public void addLast(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
     public void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");


    }
    public static void main(String[] args){
        Mergesort list1=new Mergesort();
        list1.addLast(1);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(6);
        list1.print();
        Mergesort list2=new Mergesort();
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(7);
        list2.addLast(8);
        list2.addLast(9);
        list2.print();
        ListNode ans=merge(list1,list2);
        ans.print();

    }

}