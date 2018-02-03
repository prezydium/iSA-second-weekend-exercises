import java.util.ArrayList;
import java.util.List;

public class Oddtriangle {


    public int rowSumOddNumbers(int n) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        Integer odd = 1;
        for (int i = 1; i <= n; i++) {
            List<Integer> row = new ArrayList<Integer>();
            while (row.size() < i) {

                row.add(odd);
                odd += 2;
            }
            triangle.add(row);
        }
        int result = 0;
        for (Integer number : triangle.get(n - 1)) {
            result = result + number;
        }

        return result;
    }
}

