package arraylist;

import java.util.ArrayList;
import java.util.Collections;


public class First {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("blue");
        colors.add("red");
        colors.add("green");
        colors.add("pink");
        colors.add("black");

        for (String i : colors){
            System.out.println(i);
        }
        System.out.println("----------2---------");
        Collections.sort(colors);
        colors.add(0,"orange");
        for (String i : colors){
            System.out.println(i);
        }
        System.out.println("----------3---------");
        String element = colors.get(1);

        System.out.println("second element:" + element);

        System.out.println("----------4---------");
        colors.set(3, "white");

        System.out.println("upd 4th el:" + colors);

        System.out.println("----------5---------");
        colors.remove(2);
        System.out.println("removed 3rd: " + colors);
        System.out.println("----------6---------");

        String target = "orange";
        System.out.println(target);
        System.out.println("----------7---------");

        Collections.sort(colors);
        System.out.println("sorted: " + colors);
        System.out.println("---------8----------");

        ArrayList<String> copy = (ArrayList<String>) colors.clone();
        System.out.println("copy: " + copy);
        System.out.println("---------9----------");

        Collections.reverse(colors);
        System.out.println("reversed: " + colors);
        System.out.println("----------10---------");

        System.out.println("colors equals copy: " + colors.equals(copy));
        System.out.println("---------11----------");

        colors.clear();
        System.out.println("cleared: " + colors);
        System.out.println("---------12----------");

        System.out.println("is empty? " + colors.isEmpty());
        System.out.println("--------13-----------");

        colors.ensureCapacity(10);
        colors.add("green");
        colors.add("black");
        colors.add("white");
        System.out.println("size=" + colors.size());
        System.out.println("---------14----------");

        colors.trimToSize();
        System.out.println("size=" + colors.size());
        System.out.println("---------15----------");
    }
}
