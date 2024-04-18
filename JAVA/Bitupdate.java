import java.util.*;
class Bitupdate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        // int n=5;
        // int pos=2;
        int bitmask=1<<pos;
        int newnum;
        if((bitmask & n)==0){
            newnum=bitmask|n;
        }
        else{
            newnum=(~(bitmask)&n);
        }
        System.out.println(newnum);
    }
}