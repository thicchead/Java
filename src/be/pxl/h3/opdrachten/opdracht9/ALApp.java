package be.pxl.h3.opdracht9;

import java.util.ArrayList;

public class ALApp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("voorbeeld1");
        list.add("voorbeeld2");
        list.add("voorbeeld3");
        System.out.println(list);

        list.add(1, "voorbeeld4");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        for (String string : list) {
            System.out.println(string);
        }

        list.removeAll(list);
        System.out.println(list);
    }
}
