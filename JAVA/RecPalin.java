class RecPalin{
    public static void main(String[] args){
        String str="vamsika";
        System.out.println(isPalin(str,0,str.length()-1));
    }
    public static boolean isPalin(String str,int start,int end){
        if(start>end)return true;
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        else
        return isPalin(str,start+1,end-1);
    }

}