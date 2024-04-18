import java.util.HashSet;
import java.util.Iterator;
class Hashing{
    public static void main(String[] args){
        HashSet<Integer> set= new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        System.out.println("size of the set is "+set.size());

        //search
        System.out.println(set.contains(1));

        //delete
        set.remove(1);
        System.out.println(set.contains(1)+" 1 has been deleted");

        if(!set.isEmpty()){
            System.out.println("set is not empty");
        }

        //iterator
        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}