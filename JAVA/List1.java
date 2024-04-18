import java.util.ArrayList;
import java.util.Scanner;
class List1{
    public static void main(String[] args){
        ArrayList<Integer> li=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("n:");
        int n=sc.nextInt();
        int count=0;
        System.out.print("element:");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
        }
        System.out.println(li);
        for(int i=0;i<li.size();i++){
            if(li.get(i)==x)count++;
        }
        System.out.print(count);
        
    }
}