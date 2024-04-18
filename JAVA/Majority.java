import java.util.Arrays;
class Majority{
    public static void main(String[] args){
        int[] a={1,1,3,4,1,2,1,2,1};
        int e=2;
        Arrays.sort(a);
        //System.out.println(a[a.length/2]);
        if(e==a[a.length/2]){
            System.out.println("yes");
        }
        
    }
}