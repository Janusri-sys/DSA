import java.util.*;
class MajorityElement{
    public static void main(String[] args){
        int[] arr={1,3,2,5,1,3,1,5,1};
        System.out.println(func(arr));
    }
    // static ArrayList<Integer> func(int[] nums){
    //     ArrayList<Integer> list=new ArrayList<>();
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    //     }
    //     for(Map.Entry<Integer,Integer> e:map.entrySet()){
    //         if(e.getValue()>n/3){
    //             list.add(e.getKey());
    //             //return e.getKey();
    //         }
    //     }
    // return list;
    // }
    static int func(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                return key;
            }
        }
    return -1;
    }
    
}