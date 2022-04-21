package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("Shlok");
        mylist.add("Madhu");
        mylist.add("Swetha");
        mylist.add("Ben");
        mylist.add("Love");

        System.out.println("Print all");
        for (String s:mylist) {
            System.out.println(s);
        }
        System.out.println("3rd element in the list is: " + mylist.get(2));
        System.out.println("Is Heart is in list: " + mylist.contains("Heart"));
        System.out.println("Size of ArrayList: " + mylist.size());

        mylist.remove("Ben");

        System.out.println("New Size of ArrayList: " + mylist.size());

    }


}