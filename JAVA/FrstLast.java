class FrstLast{
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(String str,int index,char element){
        if(index>str.length()-1){
            System.out.println("First occurrance of "+element+" is "+first);
            System.out.println("Last occurrance of "+element+" is "+last);
            return;
        }

        char currChar=str.charAt(index);
        if(currChar==element){
            if(first==-1)first=index;
            last=index;
        }
        findOccurance(str,index+1,element);
    }
    public static void main(String[] args){
        String str="fdfdggrrcdaef";
        char element='a';
        findOccurance(str,0,element);
        }
}