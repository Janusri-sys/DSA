class Pairsum{
    public static void main(String[] args){
        int[] arr1={274,380,770,777,851};
        int[] arr2={143,256,580,861,885};
        int M=arr1.length;
        int N=arr2.length;
        int sum=994,c=0;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(arr1[i]+arr2[j]==sum)c++;
                if(arr1[i]+arr2[j]>sum)break;
            }
        }
        System.out.println(c);
    }
}