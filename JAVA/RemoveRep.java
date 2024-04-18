class RemoveRep{
    public static void main(String[] args){
        int[] a={1,5,2,1,2,3,1};
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    for(int k=j;k<n-1;k++){
                        a[k]=a[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for(int arr:a){
            System.out.print(arr+" ");
        }

    }
}