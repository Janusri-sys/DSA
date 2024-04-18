class RemoveX{
    public static void moveAllX(String str,int idx,int count,String newString){
        if(idx==str.length()){
            while(count>0){
                newString+='x';
                count--;
            }
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(str,idx+1,count,newString);
        }
        else{
            newString+=currChar;
            moveAllX(str,idx+1,count,newString);
        }
    }
    public static void main(String[] args){
        String arr="axbcxxd";
        String newString="";
        moveAllX(arr,0,0,newString);
        // int count=0;
        // StringBuilder result=new StringBuilder();
        // //StringBuilder xChars=new StringBuilder();
        // for(int i=0;i<arr.length();i++){
        //     if(arr.charAt(i)!='x'){
        //         result.append(arr.charAt(i));
        //     }
        //     else{
        //         //xChars.append(arr.charAt(i));
        //         count++;
        //     }
        // }
        // while(count>0){
        //     result.append("x");
        //     count--;
        // }
        // System.out.println(result);
    }
}
