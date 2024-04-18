import java.util.*;
class Hashmap{
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();


        //insertion
        map.put("India",120);
        map.put("china",140);
        map.put("Us",39);


        map.put("china",130);//updates
        System.out.println(map);

        //search
        if(map.containsKey("china")){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is not present");
        }

        //get value corresponding to key

        System.out.println(map.get("china"));//key exists if not print null


        //iteration
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.print(e.getKey());
            System.out.print(e.getValue());


        }
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        map.remove("china");
        System.out.println(map);
    }
}