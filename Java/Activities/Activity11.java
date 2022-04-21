package activities;

import java.util.HashMap;

public class Activity11 {

    public static void main (String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Blue");
        hash_map.put(2, "Red");
        hash_map.put(3, "Yellow");
        hash_map.put(4, "Green");
        hash_map.put(5, "Pink");

        System.out.println("Print HashMap " + hash_map);

        System.out.println("Remove Red " + hash_map.remove(2));

        System.out.println("Print After removing Red " + hash_map);

        if(hash_map.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }

        System.out.println("Number of pairs in the Map is: " + hash_map.size());
    }
}