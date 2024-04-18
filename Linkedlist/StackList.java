import java.util.*;
class StackList{
   ArrayList<Integer> list=new ArrayList<>();

    public boolean isEmpty(){
        return list.size()==0;
    }
    public void push(int data){
        list.add(data);
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int delElement=list.get(list.size()-1);
        list.remove(list.size()-1);
        return delElement;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    public static void main(String[] args){
        StackList s=new StackList();
        // Stack<Integer> s=new Stack<>();
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