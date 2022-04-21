package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("I");
        hs.add("L");
        hs.add("O");
        hs.add("V");
        hs.add("E");
        hs.add("U");

        System.out.println("Original HashSet " + hs);

        System.out.println("Size of HashSet " + hs.size());

        System.out.println("Removing U " + hs.remove("U"));

        if(hs.remove("B")) {

            System.out.println("B removed from the Set");
        } else {
            System.out.println("B is not present in the set");
        }



        System.out.println("Checking if B is present" + hs.contains("B"));

        System.out.println("Latest HashSet " + hs);

    }


}