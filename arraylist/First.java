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
        System.out.println("-------------------");
        for (String i : colors){
            System.out.println(i);
        }
        Collections.sort(colors);
        colors.add(0,"orange");
        for (String i : colors){
            System.out.println(i);
        }
        System.out.println("-------------------");
        String element = colors.get(1);

        System.out.println("second element:" + colors);

        System.out.println("-------------------");
        colors.set(4, "white");

        System.out.println("upd 4th el:" + colors);
    }
}
