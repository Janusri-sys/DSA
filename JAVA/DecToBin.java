import java.util.*;
class DecToBin{
    public static String decToBin(int decimal){
        StringBuilder binary=new StringBuilder();
        if(decimal==0){
            return "0";
        }
        while(decimal>0){

            int rem=decimal%2;
            binary.insert(0,rem);
            decimal/=2;
        }
        return binary.toString();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int dec=sc.nextInt();
        System.out.println(decToBin(dec));
    }
}