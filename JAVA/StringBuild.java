class StringBuild{
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(1));
       sb.setCharAt(0,'p');
        System.out.println(sb);

        sb.insert(0,'s');
         System.out.println(sb);

         sb.delete(2,3);
          System.out.println(sb);

        sb.append("y");
         System.out.println(sb);
        //sb.pop();
         System.out.println(sb); 
         System.out.println(sb.length());
    }
}