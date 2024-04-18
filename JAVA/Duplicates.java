import java.util.*;
class Duplicates{
    public static void main(String[] args){
    //     ArrayList<Integer> li=new ArrayList<>();
        int[] arr={1,2,1,4,3,2,4,5};
    //     for(int i=0;i<a.length;i++){
    //         for(int j=i+1;j<a.length;j++){
    //             if(a[i]==a[j] && a[j]!=-1){
    //                 a[j]=-1;
    //             }
    //         }
    //     }
    //    for(int i=0;i<a.length;i++){
    //     if(a[i]!=-1)
    //     li.add(a[i]);
    //    }
    //     System.out.println(li);

        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>1){
                li.add(key);
            }
        }
        if(li.isEmpty())li.add(-1);
        System.out.println(li);
    }
}