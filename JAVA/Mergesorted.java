import java.util.Arrays;
class Mergesorted{
    public static void main(String[] args){
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int n=3,m=3,j=0;
        if(nums2.length!=0){
            for(int i=0;i<n+m;i++){
            if(nums1[i]==0){
                nums1[i]=nums2[j++];
            }
        }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}