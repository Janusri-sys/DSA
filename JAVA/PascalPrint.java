class PascalPrint{
    public static int fact(int i){
        if(i==0)return 1;
        return i*fact(i-1);
    }
    public static void main(String[] args){
        int n=4;
        for(int i=0;i<=n;i++){
            for(int k=0;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(fact(i)/(fact(i-j)*fact(j))+" ");
            }
            System.out.println();
        }
    }
}