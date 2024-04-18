class RecPermut{
    public static void printPermutations(String str,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            //"abc"-->"ab"-->"c"
            String newstr=str.substring(0,i)+str.substring(i+1);
            printPermutations(newstr,permutation+currChar);

        }
    }
    public static void main(String[] args){
        String str="abc";
        printPermutations(str,"");

    }
}
//3p3=3!=6
//4!=24

