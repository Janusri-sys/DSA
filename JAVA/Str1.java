import java.util.*;
class Str1{
    public static void main(String[] args) {
        String s="abacdaa",s1="dddd";
        String newStr="";
        ArrayList<Integer> li=new ArrayList<>();
        int count=0;
        System.out.println();
        for(int i=0;i<s.length();i++){
            boolean isFound=false;
            for(int j=0;j<newStr.length();j++){
                if(s.charAt(i)==newStr.charAt(j)){
                    isFound=true;
                    break;
                }
                
            }
            if(isFound){
                newStr+='#';
            }
            else{
                newStr+=s.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}