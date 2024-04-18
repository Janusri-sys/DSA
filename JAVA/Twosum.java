import java.util.*;
class Twosum{
    public static void main(String[] args){
        int[] arr={16,4,23,8,15,42,1,2};
        int target=19;
        System.out.println(Arrays.toString(twosum(arr,target)));
    }
    static int[] twosum(int[] arr,int target){
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                
                ans[0]=map.get(target-arr[i]);
                ans[1]=i;
                return ans;
            }
            else{
                map.put(arr[i],i);
            }
        }
        return ans;
    }
}