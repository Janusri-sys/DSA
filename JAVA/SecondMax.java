class SecondMax{
    public static void main(String[] args){
        int[] a={1,1,2};
        int n=a.length;
        int max=0;
        int secMax=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                secMax=max;
                max=a[i];
            }
            if(a[i]<max && a[i]>secMax){
                secMax=a[i];
            }
        }
        System.out.println(secMax);
    }
}