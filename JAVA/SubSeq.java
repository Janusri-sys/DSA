import java.util.HashSet;
class SubSeq{
    public static void subsequences(String str,int index,String newstr,HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newstr)){
                return;
            }
            else{
            System.out.println(newstr);
            set.add(newstr);
            return;
            }
        }
        char currChar=str.charAt(index);
        //to be 
        subsequences(str,index+1,newstr+currChar,set);

        //or not to be
        subsequences(str,index+1,newstr,set);
    }
    public static void main(String[] args){
        String str="abc";
        HashSet<String> set=new HashSet<>();
        subsequences(str,0,"",set);

    }
}