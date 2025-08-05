package coffee.Stream;
import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> value=new ArrayList<>();
            for (int i=1; i<=100; i++)
        {
            value.add(i);
        }
        value.parallelStream().forEach(System.out::println);
    }

}
