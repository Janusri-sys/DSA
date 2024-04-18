import java.util.*;
class Conditions{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
         else{
            System.out.println("Not an Adult");
        }
        String intro=sc.next();
        switch(intro){
            case "english":
                System.out.println("Hello");
                break;
            case "telugu":
                System.out.println("Namasthe");
                break;
            case "french":
                System.out.println("bonjour");
                break;
            default:
                System.out.println("Bye");
        }
   }
}
