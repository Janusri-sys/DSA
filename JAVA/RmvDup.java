import java.util.*;
class RmvDup{
    public static void main(String[] args){
        int[] a={1,3,4,1,2,5,3,1,2};
        // System.out.println(removeduplicates(a));
        int[] ans=removeduplicates(a);
        System.out.println(Arrays.toString(ans));
    }
    static int DupCount(int[] a){
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                count++;
                map.put(a[i],1);
            }

        }
        return count;
    }

    static int[] removeduplicates1(int[] a){
        int count=0;
        int[] result=new int[DupCount(a)];
        int index=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
                result[index]=a[i];
                index++;
            }
        }
        return result;
    }
    static int[] removeduplicates(int[] a){
        int count=0;
        
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
                list.add(a[i]);
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}