import java.util.*;
class RemoveDup{
    static int[] removeduplicates(int[] arr){
        ArrayList<Integer> result=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:arr){
            if(!set.contains(num)){
                set.add(num);
                result.add(num);
            }
        }
        System.out.println(result);
        int[] newarr=new int[result.size()];
        for(int i=0;i<newarr.length;i++){
            newarr[i]=result.get(i);
        }
        return newarr;
    }
    public static void main(String[] args){
        int[] arr={1,2,1,1,3,4,3};
        System.out.println(Arrays.toString(removeduplicates(arr)));
        
    }
}