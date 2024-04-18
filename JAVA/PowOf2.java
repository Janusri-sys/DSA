import java.util.*;
class PowOf2{
    // static boolean powoftwo(int n){
    //     while(n>0){
    //         if(n==1){
    //             return true;
    //         }
    //         else if(n%2==0){
    //             n/=2;
    //         }
    //         else{
    //             break;
    //         }
    //     }
    //     return false;
    // }
    // static boolean powoftwo(int n){
    //     if(n==1){
    //         return true;
    //     }
    //     else{
    //         if(n%2==0){
    //             return powoftwo(n/2);
    //         }
    //         else{
    //             return false;
    //         }
    //     }
    // }
    static boolean powoftwo(int n){
        if(n<=0){
            return false;
        }
        else{
            return (n&(n-1))==0;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(powoftwo(n));
    }
}