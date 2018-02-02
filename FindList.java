import java.util.*;

class FindList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        Set<String> set = new HashSet<>();

        for (String name : children) {
            for (int i = 0; i < santasList.size(); i++) {
                if (santasList.get(i).equals(name)) {
                    set.add(name);
                }

            }
        }
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);
        return list;
    }
}