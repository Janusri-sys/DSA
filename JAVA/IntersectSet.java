import java.util.*;
class IntersectSet{
    public static void main(String[] args){
        int[] a={7,3,9};
        int[] b={6,3,9,2,9,4};
        intersection(a,b);
    }
    static void intersection(int[] a,int[] b){
        HashSet<Integer> set=new HashSet<>();
        int c=0;
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){ 
                c++;
                set.remove(b[i]);
            }
        }
        System.out.println(set+" "+c);
    }
}