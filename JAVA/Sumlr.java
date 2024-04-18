class Sumlr{
    static int sum(int start,int end,long[] arr){
        int sum=0;
        while(start<=end){
            sum+=arr[start];
            start++;
        }
        return sum;
    }
    public static void main(String[] args){
        long[] arr={1,3,5,2,2};
        int n=arr.length;
        if(n==1)System.out.println(1);
        for(int i=1;i<n-1;i++){
            
            if(sum(0,i-1,arr)==sum(i+1,n-1,arr)){
                System.out.println(i+1);
            }
            
        }
    }
}