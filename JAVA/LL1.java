import java.util.*;
class LL1{
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.add("list"); //addLast by default
        list.addFirst("this");
        System.out.println(list);
        System.out.println("size:"+list.size());

        //iterate over linked list
        for(int i=0;i<list.size();i++){
            if(list.get(i)=="this"){System.out.println("Found");}
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        //delete
        list.removeFirst();
        System.out.println(list);
        //list.remove();  //removeFirst by default
        //System.out.println(list);
        list.removeLast();
        list.remove(0); //index
        list.remove();
        System.out.println(list);
    }
}