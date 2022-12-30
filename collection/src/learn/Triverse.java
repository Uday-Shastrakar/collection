package learn;

import java.util.*;

public class Triverse {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("uday");
        name.add("shubham");
        name.add("mohit");
        name.add("uday");

        //for each loop
        for (String str : name) {
            System.out.print(str + "\t" + str.length() + "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("---------------------");

        //eversing using iterator forward treverse
        Iterator<String> itr = name.iterator();
        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("_____________________");
        //backwared treversal of collection
        ListIterator<String> litr = name.listIterator(name.size());
        while (litr.hasPrevious()) {
            String previous = litr.previous();
            System.out.println(previous);
        }
        System.out.println("______________");
        //Enumeration

        Vector v=new Vector();
        v.addAll(name);
        v.add("shubham");

        Enumeration e= v.elements();
        while(e.hasMoreElements()){
            Object o = e.nextElement();
            System.out.println(o);
        }
        System.out.println("_________________-for Each--------------------");
        //for each method
        name.forEach(f->{System.out.println(f);});

        System.out.println("------Treeset---sorting of elements-----");

        TreeSet<String> set =new TreeSet<>();
        set.addAll(name);
        set.forEach(f ->{
            System.out.println(f);
        });

        //comaprable
//        comparator





    }





}
