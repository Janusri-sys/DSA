class ThirdMax{
    public static void main(String[] args){
        int[] a={4,5,3,7,2,6};
        int n=a.length;
        Integer max=null;
        Integer secMax=null;
        Integer thirdMax=null;
        for(int i=0;i<n;i++){
            if(max==null||a[i]>max){
                thirdMax=secMax;
                secMax=max;
                max=a[i];
            }
            else if(secMax==null||a[i]>secMax){
                thirdMax=secMax;
                secMax=a[i];
            }
            else if(thirdMax==null||a[i]>thirdMax){
                thirdMax=a[i];
            }
        }
        if(thirdMax==null)thirdMax=max;
        System.out.println(thirdMax);
    }
}