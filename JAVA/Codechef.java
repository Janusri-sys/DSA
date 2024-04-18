import java.util.*;
import java.util.Arrays;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read=new Scanner(System.in);
		int N=read.nextInt();
		List<Integer> l=new ArrayList<>();
        for(int i=0;i<N;i++){
            l.add(read.nextInt());
        }
        for(int i=N-1;i>=0;i--){
            if(countOcurrances(l,l.get(i))>3){
                System.out.println(l.get(i)+" "+i);
                break;
            }
        }
        
    }
    public static int countOcurrances(List<Integer> list , int element){
        int count=0;
        for(int num:list){
            if(num==element){
                count++;
            }
        }
        return count;
    }
}
