//bitmask=1<<pos
//to get the required bit  bitmask AND num
//to set the required bit bitmask OR num (set to 1)
//to clear bit(0) NOT(bitmask) ==>AND n
// to update both set and clear
class BitGet{
    public static void main(String[] args){
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        // if((bitmask & n)==0){
        //     System.out.println("The bit is zero");
        // }
        // else{
        //     System.out.println("The bit is one");
        // }

        // int newnum=bitmask|n;
        // System.out.println(newnum);

        int newnum=(~(bitmask))&n;
        System.out.println(newnum);
    }
}