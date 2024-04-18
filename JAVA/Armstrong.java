import java.util.*;
class Armstrong{
    public static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args){
        int n=2,sum=0;
        int n_digits=count(n),x=n;
        System.out.println(n_digits);
        while(n>0){
            int rem=n%10;
            sum+=Math.pow(rem,n_digits);
            n=n/10;
        }
        if(sum==x){
            System.out.println("Armstrong number");
        }
        else{
           System.out.println(" Not an Armstrong number"); 
        }
    }
    
}