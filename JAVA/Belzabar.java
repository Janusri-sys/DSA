import java.util.*;
class Belzabar{
    public static boolean is_prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean is_belzabar_number(int number){
        if(number<44){
            return false;
        }
        for(int i=2;i<=(number/2);i++){
            if(number%i==0 && is_prime(i)){
                if(i*(i+20)==number || i*(i-20)==number){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int count=0;
    for(int i=44;i<=x;i++){
        if(is_belzabar_number(i)){
            count+=1;
        }
    }
    System.out.println(count);
    System.out.println(is_belzabar_number(x));
    }
}