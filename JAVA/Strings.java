import java.util.*;
class Strings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // String lastName="Janu sri";
        // // System.out.println(name.charAt(3));
        // //concat
        // String fullName=name+" "+lastName;
        // System.out.println(fullName);
        //charAt
        //compareTo
        // System.out.println(name.compareTo(lastName));
        //substring
        String sentence="My name is janu ";
        System.out.println(sentence.substring(12,sentence.length()));
        System.out.println(sentence.replace("a","o"));
        String s1="hello";
        String s2=new String("hello");
    
        System.out.println(s1==s2);


    }
}