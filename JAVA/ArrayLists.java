import java.util.ArrayList;
import java.util.Collections;
class ArrayLists{
    public static void main(String[] args){
        ArrayList<Integer> list1=new ArrayList<>();
        // ArrayList<String> list2=new ArrayList<>();

        //Add elements
        list1.add(2);
        list1.add(1);

        System.out.println(list1);

        //get elements
        int element=list1.get(0);
        System.out.println(element);

        //Add in between
        list1.add(1,100);
        System.out.println(list1);

        //set element
        list1.set(2,200);
        System.out.println(list1);

        //remove element
        list1.remove(0);
        System.out.println(list1);

        //size of list
        System.out.println(list1.size());

        //traverse
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        //sorting
        Collections.sort(list1);
    }

}