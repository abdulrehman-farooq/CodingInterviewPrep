package CodeTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapTemplate {
    public static void main(String[] args) {
     HashMap<Integer,String> map = new HashMap<Integer,String>();
     map.put(10, "test");
     map.put(11, "test1");

     if(map.containsKey(10)){
         map.remove(10);
     }

     String defaultVal = map.getOrDefault(10, "test default");

     System.out.println("Default Value" + defaultVal);

     /** Traversing Keys **/
     for(int key: map.keySet()){
           map.get(key);
     }

     /*** convrting map to array **/
     List<String> list = new ArrayList<>(map.values());

     /** Coparing map to array **/
     HashMap<Integer,String> CompareMap = new HashMap<Integer,String>();
     map.equals(CompareMap);
    }
}
