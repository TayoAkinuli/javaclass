package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();

        map1.put("name","Agrames");
        map1.put("height","6.3");
        map1.put("gender","male");

        map1.forEach((k, v)->{
            System.out.println(k+" = "+v);

        });

        System.out.println(map1.containsValue("6.3"));

        System.out.println(map1.get("heights"));

        map1.clear();
        System.out.println(map1);


    }
}
