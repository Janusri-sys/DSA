import java.util.*;
class Sort012{
    public static void main(String[] args){
        int[] a={0,1,0,1,2,0,1};
        int start=0,k=0,end=a.length-1;
        while(k<=end){
            if(a[k]==0){
                if(k!=start){
                int temp=a[start];
                a[start]=a[k];
                a[k]=temp;
                }
                start++;
                k++;

            }
            else if(a[k]==1){
                k++;
            }
            else{
                int temp=a[end];
                a[end]=a[k];
                a[k]=temp;
                end--;

            }
            
        }
        System.out.println(Arrays.toString(a));
    }
}