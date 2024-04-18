import java.util.Arrays;
import java.util.*;
class Pascal{
    public static void main(String[] args){
        int n=4;

        List<List<Integer>> li1=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> li2=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    li2.add(1);
                }
                else{
                    li2.add(li1.get(i-1).get(j-1)+li1.get(i-1).get(j));
                }
            }
            li1.add(li2);
        }
        System.out.println(li1);
    }
}