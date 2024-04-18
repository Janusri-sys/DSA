import java.util.ArrayList;
class FirstNeg{
    public static void main(String[] args){
        int[] a={12,-1,-7,8,-15,30,16,28};
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0,k=3;
        while(j<a.length){
            if(a[j]<0){
                list.add(a[j]);
                i++;
                j=i;
            }
            else if(j-i+1<k){
                j++;
            }
            else{
                list.add(0);
            }
        }
        System.out.println(list);
    }
}