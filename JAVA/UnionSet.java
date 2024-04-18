import java.util.*;
class UnionSet{
    public static void main(String[] args){
        int[] a={7,3,9};
        int[] b={6,3,9,2,9,4};
        union(a,b);
    }
    static void union(int[] a,int[] b){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(!set.contains(b[i])){ //this can be done by def by set
                set.add(b[i]);
            }
        }
        System.out.println(set);
    }
}