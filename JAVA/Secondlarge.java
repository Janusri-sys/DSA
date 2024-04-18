class Secondlarge{
    public static void main(String[] args){
        String s="abc111";
        int n=s.length();
        int large=-1;
        int seclarge=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int digit=s.charAt(i)-'0';
                if(digit>large){
                    seclarge=large;
                    large=digit;
                }
                if(digit<large && digit>seclarge){
                    seclarge=digit;
                }
            }
            else continue;
        }
        System.out.println(seclarge);
    }
}