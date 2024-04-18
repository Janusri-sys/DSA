class CircularRot{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        
        int n=arr.length;
        int[] c_arr=new int[n];
        int j=0,start=0;
        for(int i=0;i<n;i++){
            if(i>=n/2 &&j<n/2+1){
                c_arr[i]=arr[start++];
        
            }
            else{
                c_arr[i]=arr[(n/2)+j];
                j++;
            }
            
            
        }


        for(int a:c_arr){
            System.out.print(a+" ");
        }
    }
}