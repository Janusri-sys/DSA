class Merge{
    public static void main(String[] args){
        int[] arr1={1,5,3,9};
        int[] arr2={0,4,2,6,9,8};
        int n=arr1.length,m=arr2.length;
        int[] result=new int[m+n];
        int i=0,j=0,k=0;
        while(k<m+n && i<n && j<m){
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n){
            result[k++]=arr1[i];
            i++;
        }
        while(j<m){
            result[k++]=arr2[j];
            j++;
        }
        for(int r:result){
            System.out.print(r+" ");
        }
    }
}