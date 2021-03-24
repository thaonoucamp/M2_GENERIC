import java.util.ArrayList;
import java.util.Iterator;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JAVA");
        list.add("PHP");
        list.add("C++");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
