class Issorted{
    public static boolean issorted(int[] arr,int index){
        if(index==arr.length-1){
            //System.out.println("sorted");
            return true;
        }
        if(arr[index]<=arr[index+1])
            return issorted(arr,index+1);
        else{
            //System.out.println("unsorted");
            return false;
        }
    }
    public static void main(String[] args){
        int[] arr={ 3, 7, 9 };
        System.out.println(issorted(arr,0));
    }
}