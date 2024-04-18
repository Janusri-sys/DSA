import java.util.*;
class RmvDupStr{
    public static boolean[] map=new boolean[26];
    public static void removeduplicates(String s,int index,String newstr){
        if(index>s.length()-1){
            System.out.println(newstr);
            return;
        }
        char currChar=s.charAt(index);
        
        if(map[currChar-'a']){
            removeduplicates(s,index+1,newstr);
        }
        else{
            map[currChar-'a']=true;
           removeduplicates(s,index+1,newstr+=currChar); 
        }
        
    }
    
    public static void main(String[] args){
        String s="abddegajibi";
        // String newstr="";
        // for(int i=0;i<s.length();i++){
        //     int index=s.charAt(i)-'a';
        //     if(map[index]==false){
        //         newstr+=s.charAt(i);
        //         map[index]=true;

        //     }
        // }
        // System.out.println(newstr);
        removeduplicates(s,0,"");
    }
}