import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Robot {

    private List<String> wordList = new ArrayList<String>(Arrays.asList("thank", "you", "for", "teaching", "me", "i", "already", "know", "the", "word", "do", "not", "understand", "input"));
    private Pattern pattern = Pattern.compile("[a-z]+");

    private boolean checkRepeating(String s){
        for(int i =0; i<wordList.size(); i++){
            if (wordList.get(i).equals(s)){
                return true;
            }
        }
        return false;
    }

    public String learnWord(String word) {
        String wordtolearn = word.toLowerCase();
        Matcher matcher = pattern.matcher(wordtolearn);
        if (!matcher.matches()) {
            return "I do not understand the input";
        } else if (checkRepeating(wordtolearn)) {
            return "I already know the word " + word;
        } else {
            wordList.add(wordtolearn);
            return "Thank you for teaching me " + word;
        }
    }
}
