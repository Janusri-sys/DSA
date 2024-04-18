import java.util.*;
class Anagram{
    public static boolean isAnagram(String s, String t) {
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String sortedS=new String(sArr);
        String sortedT=new String(tArr);
        System.out.println(sortedS);
        System.out.println(sortedT);
        if(sortedS.equals(sortedT))return true;
        return false;
    }
    public static void main(String[] args){
        String s="anagram";
        String t="nagaram";
        System.out.println(isAnagram(s,t));

    }
}