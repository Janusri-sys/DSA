import java.util.*;
class Countones{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            
            count+=n%2;
            n/=2;
        }
        System.out.println(count);
    }
}