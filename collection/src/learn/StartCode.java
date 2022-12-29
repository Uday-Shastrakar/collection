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
        System.out.println(name.get(1));

        //un type safe
        LinkedList list = new LinkedList();
        list.add("uday");
        list.add(12);
        list.add(6.566);
        list.add(true);

        System.out.println(list);

    }
}
