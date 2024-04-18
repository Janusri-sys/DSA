import java.util.*;
import java.util.Arrays;
class Targetemp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner read=new Scanner(System.in);
		int N=read.nextInt();
        int[] hrs=new int[N];
		// List<Integer> l=new ArrayList<>();
        for(int i=0;i<N;i++){
            hrs[i]=read.nextInt();
        }
        Arrays.sort(hrs);
        System.out.println(Arrays.toString(hrs));
        int target=read.nextInt();
        int count=0;
        for(int i=0;i<N;i++){
            if(hrs[i]>=target)
            count++;
        }
        System.out.println(count);
    }
}