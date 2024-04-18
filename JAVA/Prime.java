
import java.util.ArrayList;
class Prime{
    public static void main(String[] args){
        //only check for numbers leassthan square root of the number itself
        int n=20;
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=1;i<=n;i++){
            //System.out.println(i+" "+isPrime(i));
            if(isPrime(i)){
                li.add(i);
            }
        }
        System.out.println(li);
    }
    // static boolean isPrime(int n){
    //     if(n<=1)return false;

    //     int c=2;
    //     while(c*c<=n){ //c<sqrt(n)
    //         if(n%c==0)return false;
    //         c++;
    //     }
    //     return true;

    // }
    public static boolean isPrime(int num) {
		//Your code goes here
		
		if(num<=1)return false;
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
}