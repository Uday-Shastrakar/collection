package learn;
import java.sql.SQLOutput;
import java.util.*;
public class StartCode {

    public static void main(String[] args) {
        System.out.println(" welcome to java code collection frame work ");
        //creating colllection
        //type safe
        ArrayList<String> name =new ArrayList<>();
        name.add("uday");
        name.add("shubham");
        name.add("mohit");
        name.add("uday");
        System.out.println(name);
//        System.out.println(name.get(1));

        //un type safe
//        LinkedList list = new LinkedList();
//        list.add("uday");
//        list.add(12);
//        list.add(6.566);
//        list.add(true);
//
//        System.out.println(list);

        name.remove(3);
        System.out.println(name);

        //size
        System.out.println("SIZE ="+name.size());
        //check item is ther or not
        System.out.println(name.contains("uday"));
        //check for empty
        System.out.println(name.isEmpty());

        //setting value
//        name.set(1,"ram");
         name.add(1,"ram");
        System.out.println(name);

        //remove all elements
//        name.clear();
        System.out.println(name);

        Vector<String> vector = new Vector<>();
        vector.addAll(name);
        System.out.println("vector"+vector);

        System.out.println("-------------------------------");
        HashSet<Double> hs= new HashSet<>();
        hs.add(1.14);
        hs.add(99.333);

        hs.add(1.22);
        hs.add(1.155);
        System.out.println(hs);

        TreeSet<Double> tset =new TreeSet<>();
        tset.addAll(hs);
        System.out.println(tset);


    }
}
