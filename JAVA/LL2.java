import java.util.*;
class LL2{
    public static void main(String[] args){
        LinkedList<Integer> li=new LinkedList<>();
        // li.add(1);
        // li.add(5);
        // li.add(7);
        // li.add(3);
        // li.add(8);
        // li.add(2);
        // li.add(3);
        // boolean flag=false;
        // int index=0;
        // System.out.println(li);
        // for(int i=0;i<li.size();i++){
        //     if(li.get(i)==7){
        //         index=i;
        //         flag=true;
        //         break;
        //     }
        // }
        // if(flag)System.out.println("Element found at index "+index);
        // else System.out.println("Not found");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
        for(int i=0;i<n;i++){
            li.add(sc.nextInt());
        }
        System.out.println(li);
        for(int i=0;i<li.size();i++){
        if(li.get(i)>50){
                System.out.println("enter elements lessthan or equal to 50");
                break;
        }
        else if(li.get(i)>25){
            li.remove(i);
        }
        }
        
        System.out.println(li);
    }
}