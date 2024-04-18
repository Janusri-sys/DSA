class ReverseStr{
    public static void main(String[] args){
        StringBuilder str=new StringBuilder("janusri");
        
        for(int i=0;i<str.length()/2;i++){
            int start=i;
            int end=str.length()-1-i;

            char startchar=str.charAt(start);
            char endchar=str.charAt(end);

            str.setCharAt(start,endchar);
            str.setCharAt(end,startchar);
            
        }
        System.out.println(str.reverse());
    }
}