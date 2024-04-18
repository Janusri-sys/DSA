class RecurPow{
    static int power(int x,int n){
        //stack height
        if(n==0)return 1;
        if(x==0)return 0;
        // return x*power(x,n-1);

        //stack height logn
        if(n%2==0){
            return power(x,n/2)*power(x,n/2);
        }
        else{
            return power(x,n/2)*power(x,n/2)*x;
        }
    }
    public static void main(String[] args){
        int x=2,n=4;
        System.out.println(power(x,n));
    }
}