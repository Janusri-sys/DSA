class CountSubarray{
    public static void main(String[] args){
        // String s="2352971";
        // int noOfSub=0,max=0;
        // for(int i=0;i<=s.length()-3;i++){
        //     int sum=0;
        //     for(int j=i;j<i+3;j++){
        //         sum=sum+(s.charAt(j)-'0');
        //         if(sum>max)max=sum;
        //     }
        //     noOfSub++;
        // };
        // System.out.println(max);


        int[] arr={2,3,5,2,9,7,1};
        int i=0,j=0,sum=0,max=0,k=3;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max=Math.max(sum,max);
                sum-=arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}