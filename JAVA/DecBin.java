import java.util.*;
class DecBin{
    public static int binToDec(int n){
        int i=0,dec=0;
        while(n>0){
            int rem=n%10;
            if(rem!=0 && rem!=1){
                System.out.println("enter a binary number");
                break;
            }
            if(rem==1){
                dec+=Math.pow(2,i);
            }
            n=n/10;
            i++;
        }
        return dec;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int bin=sc.nextInt();
        
        System.out.println("Decimal equivalent for the given number is "+binToDec(bin));
    }
}