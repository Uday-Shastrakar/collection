package learn;

import java.util.HashMap;

public class mapex {
    public static void main(String[] args) {
        HashMap<String,Integer> courses= new HashMap<>();
        //adding element
        courses.put("core java",4000);
        courses.put("python",3500);
        courses.put("spring",8000);


        System.out.println(courses);

        courses.forEach((e1,e2)->{
            System.out.println(e1+"=>" + e2);
        });

    }
}
