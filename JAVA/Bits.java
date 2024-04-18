class Bits{
    public static void main(String[] args){
        //int n=8;
        //1.even or odd
        //System.out.println(n&1);

        //2.Position of right most set bit
        // int iterate=1;
        // while((n&1)!=1){
        //     n>>=1;
        //     iterate++;
        // }
        // System.out.println(iterate);

        //3.every number appear twice only one number is unique find it in an array

        // int[] arr={2,3,4,1,2,1,3,6,4};
        // int unique=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     unique^=arr[i];
        // }
        // System.out.println(unique);

        //4.ith bit of a number
        int n=8;
        int pos=4;
        int bitmask=1<<(pos-1);
        if((n&bitmask)==0)
        System.out.println("bit is zero");
        else System.out.println("bit is one");



    }
}