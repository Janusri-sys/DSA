class RecKeypad{
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCom(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(index);
        String mapping=keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            printCom(str,index+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args){
        String str="42";
        printCom(str,0,"");
    }
}
//time complexity = No.of choices ^ length of string (3^2)