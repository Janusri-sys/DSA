import java.util.Arrays;
class PendulumArr{
    public static void main(String[] args){
        int[] arr={539,161,985,856,166,29,726,590};
        int n=arr.length;
        Arrays.sort(arr);
        int[] newarr=new int[n];
        int mid=(n-1)/2;
        int i=0;
        newarr[mid]=arr[i++];
        int left=mid-1;
        int right=mid+1;
        while(right<n&&left>=0&&i<n){
            newarr[right]=arr[i++];
            newarr[left]=arr[i++];
            right++;left--;
        }
        while(right<n && i<n){
            newarr[right++]=arr[i++];
        }
        while(left>=0 && i<n){
            newarr[left--]=arr[i++];
        }
        for(int a:newarr){
            System.out.print(a+" ");
        }
    }
}