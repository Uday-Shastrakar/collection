package learn;

import java.util.ArrayList;

public class Triverse {
    public static void main(String[] args) {
        ArrayList<String> name =new ArrayList<>();
        name.add("uday");
        name.add("shubham");
        name.add("mohit");
        name.add("uday");

        //for each loop
        for(String str:name){
            System.out.println(str +"\t"+str.length());
        }

    }
}
