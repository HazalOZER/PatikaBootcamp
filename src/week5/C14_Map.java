package week5;

import java.util.HashMap;
import java.util.Map;

public class C14_Map {
    public static void main(String[] args) {
        //clear
        //containsValue(Object Value)
        //containsKey(Object Key)
        //get(Object key)

        Map<String,String> country = new HashMap<>();
        country.put("TR","Türkiye");
        country.put("TR","TürkiyeYeni");//set yok terine yeni bir değer ekleyerek değiştirebiliriz
        country.put("D","Almanya");
        country.put("EN","İngiltere");

        country.remove("En");
        System.out.println(country.get("TR"));
        System.out.println(country.get("En"));
        System.out.println("-----------");
        for (String key:country.keySet()) {
            System.out.println(key);
           // System.out.println(country.get(key));Bu da value gezer
        }
        System.out.println("----------");
        for (String value:country.values()) {
            System.out.println(value);
        }
        System.out.println("----------");

        country.replace("D","Doçland");
        System.out.println(country.get("D"));

    }
}
