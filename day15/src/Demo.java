import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Demo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("aa");
        list.add("bb");
        list.add("aa");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        list.add("bb");

        HashSet<String>  hash = new HashSet<>(list);
        System.out.println(hash);


    }

}
