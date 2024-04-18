class FiveSquare{
    public static int square(int n){
        int ans=0;
        for(int i=1;i<=5;i++){
            ans+=n;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.print(square(square(5)));
    }
}