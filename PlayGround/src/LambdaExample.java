import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Python");
        names.add("C++");

        // --- OLD WAY: Using an anonymous inner class ---
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        // --- NEW WAY: Using a Lambda Expression ---
        // Java automatically figures out the data types!
        Collections.sort(names, (a, b) -> a.compareTo(b));

        // Printing the list using another lambda (forEach)
        names.forEach(name -> System.out.println(name));
    }
}