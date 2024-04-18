class NegCount{
    public static void main(String[] args){
        int[][] a={{1,1,2,-1,-2},{2,-3,-1},{11,1,7,-2},{-1,-1,-2,-3}};
        System.out.println(countZero(a,a.length));
    }
    public static int countZero(int[][] a,int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=a[i].length-1;j>=0;j--){
                if(a[i][j]>=0)break;
                count++;
            }
        }
        return count;
    }
}